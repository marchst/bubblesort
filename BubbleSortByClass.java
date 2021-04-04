package buble;

public class BubbleSortByClass {
    public static void main(String []args) {
        String[][] persons = Person.person;
        String[] temp;
        for (int j = 0; j < persons.length; j++) {
            for (int i = j + 1; i < persons.length; i++) {
                // comparing adjacent strings
                if (persons[i][1].compareTo(persons[j][1]) < 0) {
                    temp = persons[j];
                    persons[j] = persons[i];
                    persons[i] = temp;
                }
            }
        }
        for (int j = 0; j < persons.length; j++) {
            for (int i = j + 1; i < persons.length; i++) {
                // comparing adjacent strings
                if (persons[i][2].compareTo(persons[j][2]) < 0) {
                    temp = persons[j];
                    persons[j] = persons[i];
                    persons[i] = temp;
                }
            }
        System.out.println(persons[j]);     
        }    
    }
}    
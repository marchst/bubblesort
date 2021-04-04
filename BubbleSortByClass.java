public class BubbleSortByClass {
    public static void main(String []args) {
        String str[][] = [{ "Name1", "Age1", "Gender1"},{ "Name2", "Age2", "Gender2"},{ "Name3", "Age3", "Gender3"}];
        String temp;
        for (int j = 0; j < str.length; j++) {
        for (int i = j + 1; i < str.length; i++) {
            // comparing adjacent strings
            if (str[i][1].compareTo(str[j][1]) < 0) {
                temp = str[j];
                str[j] = str[i];
                str[i] = temp;
            }
        }
        for (int j = 0; j < str.length; j++) {
        for (int i = j + 1; i < str.length; i++) {
            // comparing adjacent strings
            if (str[i][2].compareTo(str[j][2]) < 0) {
                temp = str[j];
                str[j] = str[i];
                str[i] = temp;
            }
        }
        System.out.println(str[j]);
        }
    }
}    
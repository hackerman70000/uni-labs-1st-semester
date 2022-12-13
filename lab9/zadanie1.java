public class zadanie1 {

    public static void main(String[] args) {

        String[] arr = {"arbuz", "arboretum", "arszenik"};
        System.out.println(findPrefix(arr));
    }

    public static String findPrefix(String[] array) {

        int shortestLength = array[0].length();
        for (int i = 1; i < array.length; i++)
            if (shortestLength > array[i].length())
                shortestLength = array[i].length();

        int check = 1, position = 0;
        String prefix = "";

        while (check != 0) {
            char letter = array[0].charAt(position);
            for (int i = 0; i < array.length; i++) {
                if (array[i].charAt(position) != letter) {
                    check = 0;
                    break;
                }
            }
            if (check != 0) {
                prefix += letter;
                position++;
            }
        }

        return prefix;
    }
}
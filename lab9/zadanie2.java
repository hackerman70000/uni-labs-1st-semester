public class zadanie2 {
    public static void main(String[] args) {

        String a = "abcd";
        String b = "cdab";

        System.out.println(checkSimilar(a, b));
    }

    public static boolean checkSimilar(String textA, String textB) {

        if (textA.length() != textB.length())
            return false;

        else if (textA.equals(textB)) return true;
        else if (swapEven(textA).equals(textB)) return true;
        else if (swapOdds(textA).equals(textB)) return true;
        else if (swapEven(swapOdds(textA)).equals(textB)) return true;
        else return false;
    }

    public static String swapEven(String text) {
        int careLength = text.length() - text.length() % 4;
        char tempSwap;

        StringBuilder textBuilder = new StringBuilder(text);

        for (int i = 0; i <= careLength; i += 4) {
            if (textBuilder.length() > i + 2) {
                tempSwap = textBuilder.charAt(i);
                textBuilder.setCharAt(i, textBuilder.charAt(i + 2));
                textBuilder.setCharAt(i + 2, tempSwap);
            }
        }
        return textBuilder.toString();
    }

    public static String swapOdds(String text) {
        int careLength = text.length() - text.length() % 4;
        char tempSwap;

        StringBuilder textBuilder = new StringBuilder(text);

        for (int i = 1; i <= careLength; i += 4) {
            if (textBuilder.length() > i + 2) {
                tempSwap = textBuilder.charAt(i);
                textBuilder.setCharAt(i, textBuilder.charAt(i + 2));
                textBuilder.setCharAt(i + 2, tempSwap);
            }
        }

        return textBuilder.toString();
    }


}
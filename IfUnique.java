public class IfUnique {
    public static void main(String[] args) {
        isStringUnique("Test String");
        isStringUnique("a");
        isStringUnique("Aa");
        isStringUnique("S p a c e");
    }

    private static void isStringUnique(String s) {
        // ASCII has only 128 unique characters
        //cant be unique if more then 128
        if (s.length() > 128) {
            displayOutput(s+" -> False");
        }
        //can be maximum of 128
        int[] aCharSet = new int[128];

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);
            if(aCharSet[value] > 0) {
                displayOutput(s+" -> False");
            } else {
                aCharSet[value]++;
            }
        }

        displayOutput(s+" -> True");
    }
    private static void displayOutput(String s){
        System.out.println(s);
    }
}
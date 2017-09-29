public class IfUnique {
    public static void main(String[] args) {
        isStringUnique("Test String");
        isStringUnique("a");
        isStringUnique("Aa");
        isStringUnique("S p a c e");
    }

    private static boolean isStringUnique(String s) {
        // ASCII has only 128 unique characters
        //cant be unique if more then 128
        if (s.length() > 128) {
            return false;
        }
        //can be maximum of 128
        int[] aCharSet = new int[128];

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);
            if(aCharSet[value] > 0) {
                return false;
            } else {
                aCharSet[value]++;
            }
        }

        return true;
    }
}
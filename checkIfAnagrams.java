import java.util.*;

public class checkIfAnagrams {
    public static boolean checkString(String s1, String s2){
        String copyS1 = s1.replaceAll("\\s","").toLowerCase();
        String copyS2 = s2.replaceAll("\\s","").toLowerCase();
        boolean status = true;
        if(copyS1.length() != copyS2.length()) {
            System.out.println("Not an anagram");
            status  = false;
        } else
        {
            char[] s1Array=copyS1.toCharArray();
            char[] s2Array=copyS2.toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            status = Arrays.equals(s1Array,s2Array);
        }

        return status;
    }

    public static void main(String[] args) {
        if(args.length!= 2){
            System.out.println("Give two arguments only");
            return;
        }
        System.out.println(checkString(args[0],args[1]));


    }
}
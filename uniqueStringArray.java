import java.util.*;
public class uniqueStringArray {
    public static void main(String[] args) {
        String[] MyStringArray = new String[] {"Hi", "Tjis", "Is", "a", "test","Hi"};
        System.out.println(printifUnique(MyStringArray));
    }

    public static boolean printifUnique(String[] testArray) {
        Set<String> uniqueSet = new HashSet<String>();

        for (int i = 0; i < testArray.length; i++) {

            if(set.add(testArray[i])){
                uniqueSet.add(testArray[i]);
            } else {
                return false;
            }
        }
//        System.out.println(uniqueSet);
        return true;

    }
}
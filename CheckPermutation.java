import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args){
        checkPermutation("god","dog");        
	}
	public static void checkPermutation (String str1, String str2){
		//if both the strings are not of the same then it can not be a permutation of one other
		if(str1.length()!=str2.length()){
			System.out.println("Both strings are not of the same length");
		}else {		
			int checker = 0;
			for(int i = 0; i < str1.length();i++ ){
        		checker ^= str1.charAt(i) ^ str2.charAt(i);
    		}

	    System.out.println("Both stings are equal = " +checker);

		}
	}
}
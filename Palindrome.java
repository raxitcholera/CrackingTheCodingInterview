public class Palindrome {
	
	public static void main(String[] args){	
		System.out.println(isPalindrome("taco cat"));
		System.out.println(isPalindrome("taco cati"));
	}


	private static boolean isPalindrome(String string) {
		int[] ascii = new int[128];
		char[] cStr = ((string.replaceAll("\\s+","")).toLowerCase()).toCharArray();
		int fail = 0;			// for odd string length
		
		for (int i = 0; i < cStr.length; i++) {
			ascii[cStr[i]]++;
		}
		for (int i = 0; i < cStr.length; i++) {
			if(ascii[cStr[i]] % 2 !=0){
				if(fail == 0)
					fail = 1;
				else
					return false;
			}
		}			
		return true;
	}
}
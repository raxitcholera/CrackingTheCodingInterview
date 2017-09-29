public class ReplaceSpace {

	public static void main(String[] args){
        replaceSpace("Test String For Example");        
	}
	public static void replaceSpace (String string){
		
		//get the length
		int len = string.length();
		//convert to character array
		char[] str = string.toCharArray();
		int cnt = 0;
		
		for(int i=0;i<len;i++){
			//get the total number of spaces in the string
			if(str[i]==' '){
				cnt++;
			}
		}
		
		//create new array that can store the extra 2 characters for the space in the string
		char[] outputCharArray = new char[len+2*cnt];
		int j = 0;
		//traverse through the original string
		for(int i = 0; i<(len);i++){
			//replace every space with %20 individually as adding to character array
			if(str[i]==' '){
				outputCharArray[j++] = '%';
				outputCharArray[j++] = '2';
				outputCharArray[j++] = '0';
			}else{
			//if not space then add the existing character as is
			outputCharArray[j++] = str[i];
			}
		}//output
		System.out.println("number of blank space: "+ cnt +" string: "+String.copyValueOf(outputCharArray));
	}
}
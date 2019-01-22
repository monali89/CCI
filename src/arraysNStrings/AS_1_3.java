package arraysNStrings;

/* Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer. 
 * NOTE: One or two additional variables are fine. An extra copy of the array is not. 
 * FOLLOW UP: Write the test cases for this method.*/

public class AS_1_3 {

	public static void main(String[] args) {
		System.out.println(removeDuplicate("abcbdaf"));
	}
	
	public static String removeDuplicate(String str){
		
		char[] a = str.toCharArray();
		int j = a.length-1;
		for(int i=0; i<a.length; i++){
			while(a[i] != a[j]){
				j--;
			}
			// Shift all values after j
			while(j<a.length-1){
				a[j] = a[j+1];
				j++;
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]);
		}
		System.out.println();
		return a.toString();
	}

}

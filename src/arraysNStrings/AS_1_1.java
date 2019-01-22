package arraysNStrings;

import java.util.ArrayList;
import java.util.HashMap;

/* Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures? */

public class AS_1_1 {

	public static void main(String[] args) {
		System.out.println(hasUnique("afelsk"));	
	}

	public static boolean hasUnique(String str){
		
		char[] a = str.toCharArray();
		ArrayList<Character> al = new ArrayList<Character>();
		for(int i=0; i<a.length; i++){
			if(al.contains(a[i])){
				return false;
			}else{
				al.add(a[i]);
			}	
		}
		return true;
	}
	
}

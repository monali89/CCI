package arraysNStrings;

import java.util.ArrayList;
import java.util.Arrays;

/* Write a method to decide if two strings are anagrams or not. */

public class AS_1_4 {

	public static void main(String[] args) {
		System.out.println(isAnagram("restful", "fguster"));
		System.out.println(isAnagram("restful", "fluster"));
	}
	
	public static boolean isAnagram(String s1, String s2){
		
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		if(a1.length != a2.length){
			return false;
		}else{
			Arrays.sort(a1);
			Arrays.sort(a2);
			for(int i=0; i<a1.length; i++){
				if(a1[i] != a2[i]){
					return false;
				}
			}
		}
		return true;
	}

}

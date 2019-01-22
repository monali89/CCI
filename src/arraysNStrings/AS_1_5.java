package arraysNStrings;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

/* Write a method to replace all spaces in a string with ‘%20’. */

public class AS_1_5 {

	/*public static void main(String[] args) {
		//System.out.println(replaceWithSomething("They may be a synonym or antonym of their subject."));
		System.out.println(replaceWithSomething2("They may be a synonym or antonym of their subject."));
	}*/
	
	@Test
	public void positive(){
		String expected = "They%20may%20be%20a%20synonym%20or%20antonym%20of%20their%20subject.";
		Assert.assertEquals(expected.trim(), replaceWithSomething2("They may be a synonym or antonym of their subject."));
	}

	public static String replaceWithSomething(String str){
		
		String[] a = str.split(" ");
		ArrayList<String> newString = new ArrayList<String>();
		for(int i=0; i<a.length-1; i++){
			newString.add(a[i]);
			newString.add("%20");
		}
		newString.add(a[a.length-1]);
		return newString.toString();
	}
	
	public static String replaceWithSomething2(String str){
		char[] a = str.toCharArray();
		int spaceCtr = 0;
		for(int i=0; i<a.length; i++){
			if(a[i] == ' '){
				spaceCtr++;
			}
		}
		char[] a2 = new char[a.length + spaceCtr*3];
		int newCtr = 0;
		for(int i=0; i<a.length; i++){
			if(newCtr<a2.length-1){
				if(a[i] == ' '){
					a2[newCtr++] = '%';
					a2[newCtr++] = '2';
					a2[newCtr++] = '0';
				}else{
					a2[newCtr++] = a[i];
				}
			}
		}
		return String.copyValueOf(a2);
	}
}

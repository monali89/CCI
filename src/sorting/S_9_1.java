package sorting;

import java.util.Arrays;

public class S_9_1 {

	public static void main(String[] args) {
		
		/*int[] a = new int[10];
		int[] b = new int[3];*/
		int[] a = {23,45,89,95,103,0,0,0,0,0};
		int[] b = {35,65,97};
		
		/*for(int i=0; i<a.length/2; i++){
			a[i] = (int)(Math.random()*100);
		}
		Arrays.sort(a);*/
		System.out.print("A: ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		/*for(int i=0; i<b.length; i++){
			b[i] = (int)(Math.random()*100);
		}
		Arrays.sort(b);*/
		System.out.print("B: ");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		int aCtr = 0, bCtr = 0;
		
		while((a[aCtr] != 0) && bCtr<b.length){
			if(a[aCtr]>b[bCtr]){
				int temp = a[aCtr];
				a[aCtr] = b[bCtr];
				b[bCtr] = temp;
			}
			aCtr++; bCtr++;
		}
		
		for(int i=0; i<b.length; i++){
			a[aCtr++] = b[i];
		}

		System.out.print("A: ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		
		
		
		
		
	}
	
	

}

package sorting;

import java.util.Date;

public class SortingAll {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int[] rsltArr = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			arr[i] = (int) (Math.random()*100);
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		Date then, now;
		
		now = new Date();
		rsltArr = bubbleSort(arr);
		then = new Date();
		System.out.println("For bubble sort: " + (now.getTime()-then.getTime()));
		for(int i=0; i<arr.length; i++){
			System.out.print(rsltArr[i] + " ");
		}
		System.out.println();
		
		now = new Date();
		rsltArr = selectionSort(arr);
		then = new Date();
		System.out.println("For selection sort: " + (now.getTime()-then.getTime()));
		for(int i=0; i<arr.length; i++){
			System.out.print(rsltArr[i] + " ");
		}
		System.out.println();
		
		now = new Date();
		rsltArr = mergeSort(arr, 0, arr.length-1);
		then = new Date();
		System.out.println("For merge sort: " + (now.getTime()-then.getTime()));
		for(int i=0; i<arr.length; i++){
			System.out.print(rsltArr[i] + " ");
		}
		System.out.println();
	}
	
	
	public static int[] bubbleSort(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] selectionSort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			int j = i+1;
			while(arr[i]>arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}
	
	public static int[] mergeSort(int[] arr, int lstart, int rend){
		
		int[] mergedArr = new int[arr.length];
		int mid = (lstart+rend)/2;
		System.out.println(lstart + " " + mid + " " + rend);
		if(lstart<rend){
			int[] leftArr = mergeSort(arr, lstart, mid);
			int[] rightArr = mergeSort(arr, mid+1, rend);
			mergedArr = merge(leftArr, rightArr);
		}
		return mergedArr;
	}
	
	public static int[] merge(int[] leftArr, int[] rightArr){
		
		System.out.println("LOG: left-" + leftArr.length + ", right-" + rightArr.length);
		int rctr = 0, lctr = 0, fctr = 0;
		int[] finalArr = new int[leftArr.length+rightArr.length-1];
		
		while(rctr<rightArr.length && lctr<leftArr.length){
			if(leftArr[lctr] > rightArr[rctr]){
				finalArr[fctr++] = leftArr[lctr++];
			}else if(rightArr[rctr] > leftArr[lctr]){
				finalArr[fctr++] = rightArr[rctr++];
			}else if(leftArr[lctr] == rightArr[rctr]){
				finalArr[fctr++] = leftArr[lctr++];
				finalArr[fctr++] = rightArr[rctr++];
			}
		}
		while(lctr<leftArr.length){
			finalArr[fctr++] = leftArr[lctr++];
		}
		while(rctr<rightArr.length){
			finalArr[fctr++] = rightArr[rctr++];
		}
		return finalArr;
	}
	
	public int[] quickSort(int[] arr){
		return null;
	}

	public int[] bucketSort(int[] arr){
		return null;
	}
}

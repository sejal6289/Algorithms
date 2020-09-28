package Algorithms;

public class MergeSort {
	
	public static void mergeSort(int[] array) {
		mergeSort(array, new int[array.length], 0 , array.length-1);	
	}
	
	public static void mergeSort(int[] array, int[] temp,  int leftStart, int rightEnd) {
		// TODO Auto-generated method stub
		//
		if(leftStart >= rightEnd) {
			return;		
		}
		int middle = (leftStart + rightEnd)/2;
		mergeSort(array, temp, leftStart, middle);
		mergeSort(array, temp, middle + 1 , rightEnd);
		
		mergeHalves(array, temp, leftStart, rightEnd);
		
	}

	private static void mergeHalves(int[] array,int[] temp, int leftStart, int rightEnd) {
		// TODO Auto-generated method stub
		int leftEnd = (rightEnd + leftStart)/2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		
		//index pointers
		int left = leftStart;
		int right = rightStart;
		
		int index = leftStart;
		
		//while they are still in bound
		while(left <= leftEnd && right <= rightEnd) {
			if(array[left] <= array[right]) {
				temp[index] = array[left];
				left ++;
			} else {
				temp[index] = array[right];
				right ++;
			}
			index ++;
			
		}
		
		System.arraycopy(array, left, temp, index, leftEnd - left +1);
		System.arraycopy(array, right, temp, index, rightEnd - right +1);
		
		System.arraycopy(temp, leftStart, array, leftStart, size);
	}

	public static void printArr(int[] arr) {
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	//Merge sorted arrays - arrayA and arrayB
	//You are given 2 sorted arrays, A and B..where A has a large enough buffer at the end to hold B. Write a method to merge ArrayB into A in sorted order. 
	
	public static void merge(int a[], int b[],int countA,int countB) {
		
		
		int indexMerged = countA + countB - 1;
		int indexA = countA - 1;
		int indexB = countB - 1;
		
		while(indexB >= 0) {
			if(indexA >= 0 && b[indexB] < a[indexA]) {
				a[indexMerged] = a[indexA];
				indexA--;
			} else {
				a[indexMerged] = b[indexB];
				indexB--;
			}
			indexMerged--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {10,90,20,5};
		MergeSort.printArr(array);
		MergeSort.mergeSort(array);
		MergeSort.printArr(array);
		
		System.out.println("2 Sorted arrays : ");
		int[] arrayA = new int[8]; 
		arrayA[0] = 10;
		arrayA[1] = 20;
		arrayA[2] = 30;
		arrayA[3] = 50;
		int[] arrayB = {21,25,52,55};
		MergeSort.printArr(arrayA);
		MergeSort.printArr(arrayB);
		
		MergeSort.merge(arrayA,arrayB,4,4);
		
		MergeSort.printArr(arrayA);
		
		
	}

}

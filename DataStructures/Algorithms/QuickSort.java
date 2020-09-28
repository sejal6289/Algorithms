package Algorithms;

public class QuickSort {
	
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length -1 );
	}
	

	private static void quickSort(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		
		//bounce check
		if(left >= right) {
			return;
		}
		
		int pivot = array [(left + right) / 2];
		int index = partition(array, left, right, pivot);
		quickSort(array, left, index-1);
		quickSort(array, right, index);
			
	}


	public static int partition(int[] array, int left, int right, int pivot) {
		// TODO Auto-generated method stub
		
		while(left <= right) {
			while(array[left] < pivot) {
				left ++;
			}
			while(array[right] > pivot) {
				right --;
			}
			
			if((left <= right)) {
				swap(array, left, right);
				left++;
				right--;
			}
			
		}
		return left;
		
	}


	private static void swap(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		
	}


	public static void printArr(int[] arr) {
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {10,90,20,5,10,8};
		QuickSort.printArr(array);
		QuickSort.quickSort(array);
		QuickSort.printArr(array);
	}

}

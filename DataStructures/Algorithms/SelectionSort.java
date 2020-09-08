package Algorithms;

public class SelectionSort {

	
	public void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			
			int min_i=i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[i]) {
					min_i=j;
					swap(arr,min_i,i);
				}
			}
		}
		
	}
	
	public void swap(int[] arr,int i,int k) {
		int temp;
		temp = arr[i];
		arr[i] = arr[k];
		arr[k] = temp;
	}
	
	public void printArr(int[] arr) {
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	public void printArr(String[] arr) {
		for(String i:arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	public void selectionSort(String[] arr) {
		
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			
			String min_str = arr[i];
			int min_idx = i;
					
				for(int j=i+1;j<n;j++) {
					
					if(arr[j].compareTo(min_str) < 0) {
						
						min_str = arr[j];
						min_idx = j;
						
						if(min_idx != i)
						{
							String temp = arr[i];
							arr[i] = arr[min_idx];
							arr[min_idx] = temp ;	
						}
					}
				}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SelectionSort ss = new SelectionSort();
		int arr[] = {5,1,4,2,8};
		
		ss.printArr(arr);
		
		ss.selectionSort(arr);
		ss.printArr(arr);
		
		String str_arr[] = {"paper", "true", "soap", "floppy", "flower"};
		ss.printArr(str_arr);
		
		ss.selectionSort(str_arr);
		ss.printArr(str_arr);

	}

}

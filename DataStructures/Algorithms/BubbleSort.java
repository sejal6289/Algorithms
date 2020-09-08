package Algorithms;

public class BubbleSort {
	
	int arr[];
	
	public void bubbleSort(int[] arr) {
		
		int l = arr.length;
		
		for(int j=0;j<l-1;j++) {
			for(int i=0;i<l-j-1;i++) {
				if(arr[i] > arr[i+1]) {
					swap(arr,i,i+1);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs = new BubbleSort();
		int arr[] = {5,1,4,2,8};
		
		bs.printArr(arr);
		
		bs.bubbleSort(arr);
		bs.printArr(arr);

	}

}

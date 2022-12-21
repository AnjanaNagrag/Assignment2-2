package com.assignment;

public class QuickSort {
	
	static void quicksort(int arr[],int low, int high){

		int mid =(low+high)/2;
		int i= low ;
		int j=high;
		int pivot =arr[mid];
		
		while(i<=j){
	
			while( arr[i]<pivot){
		
				i++;
			}
			
		    while( arr[j]>pivot){
		
			    j--;
		   }
		if(i<=j){
	
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
         if (low<j)
        	 quicksort(arr,low,j);
         if(high>i)
        	 quicksort(arr,i,high);
}      	 
	public static void main(String[] args) {
		
		int arr[]={ 15,20,56,34,67,12};
		System.out.println("Before sorting");
	    for (int i=0;i<arr.length;i++){
	    	System.out.println(arr [i]);
	    }
		quicksort(arr,0,arr.length-1);
		System.out.println("Before sorting");
	    for (int i=0;i<arr.length;i++){
	    	System.out.println(arr [i]);
		
	    }


}

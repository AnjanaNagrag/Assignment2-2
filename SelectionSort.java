package com.assignment;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {38,46,89,22,11,8,43};
      int min;
      int temp=0;
      for(int i=0;i<a.length; i++)
      {
    	  min =i;
    	for (int j=i+1;i<a.length;j++)
    	{
    		if(a[j]<a[min])
    		{
    			j=min;
    			
    		}
    		
    	}
    	
    	temp=a[i];
		a[i]=a[min];
		a[min]=temp;
      }
      
      for (int i=0;i<a.length;i++)
      {
    	  System.out.print(a[i] + " ");
      }
	}

}

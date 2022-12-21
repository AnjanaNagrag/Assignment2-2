package com.assignment;

class SubsetArray{

	   static boolean subArray(int arr1[], int arr2[], int m, int n)
	    {
	        int i = 0;
	        int j = 0;
	        for (i = 0; i < n; i++) 
	        {
	            for (j = 0; j < m; j++) 
	            {
	                if (arr2[i] == arr1[j])
	                    break;
	            }
	 
	            if (j == m)
	            return false;
	        }
	 
	        return true;
	    }
	   
		public static void main (String[] args) {
			
			int arr1[] = { 3,2,5,4,6,8,1 };
	        int arr2[] = { 1,5,4,6,8 };
	    
	        int m = arr1.length;
	        int n = arr2.length;
	 
	        if (subArray(arr1, arr2, m, n))
	            System.out.print("Array 2 is subset of Array1 ");
	        else
	            System.out.print("Array2 is not subset of Array1 ");
	 

		}

	}

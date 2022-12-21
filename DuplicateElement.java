package com.assignment;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int a[]={10,30,40,58,90,90,10};
		
		boolean flag =false;
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println("Duplicate Element found in the array " +  a[i]);
					flag=true;
				}
				
			}
		}
		
        if (flag==false)
		System.out.println("Duplicate Element is not found");
	}

}

package com.exam;

import java.util.*;

public class QuickSortDemo 
{	

	int partition(int a[],int start, int end)
	{		
			int pivot=a[end];
			int i=start-1;
			
			for(int j=start;j<end;j++)
			{
				if(a[j]<pivot)
				{
					i++;
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			int t=a[i+1];
			a[i+1]=a[end];
			a[end]=t;
			
			return i+1;
	}	
	
	void quick(int a[],int start, int end)
	{
		if(start<end)
		{
			int p=partition(a,start,end);
			quick(a,start,p-1);
			quick(a,p+1,end);
			
		}
		
	}
	
	void printArray(int a[], int n)
	{
		for(int i=0;i<n;i++)
			System.out.println(a[i]+" ");
	}
	
	
	public static void main(String ar[])
	{		
			int a[]=new int[10];
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			
			System.out.println("Enter numbers:");
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			System.out.println("Sorted array");
			for(int i=0;i<n;i++)
				System.out.println(a[i]+" ");
			
			QuickSortDemo q=new QuickSortDemo();
			System.out.println("Before Sorting array");
			q.printArray(a,n);
			q.quick(a,0,n-1);
			
			System.out.println("After sorting");
			q.printArray(a,n);
		
	}
	

}

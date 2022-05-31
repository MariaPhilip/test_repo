package com.exam;

import java.util.*;

public class QuickSortMatrix 
{
	int partition(int a[],int start, int end)
	{	int temp;
		int pivot=a[end];
		int i=start-1;
		for(int j=start;j<end;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp=a[i+1];
		a[i+1]=a[end];
		a[end]=temp;
		
		return i+1;
	}
	
	void quick(int a[],int start,int end)
	{
		int p=partition(a[][],start,end);
		quick(a[][],start,p-1);
		quick(a[][],p+1,end);
		
	}
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[10][10];
		System.out.println("Enter row and col");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		System.out.println("Enter elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
			
		}
		
		printArray(int a[][],int row, int col)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++);
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println(" ");
			}
			
		}
		
		QuickSortMatrix q=new QuickSortMatrix();
		
		System.out.println("Before Sorting array");
		q.printArray(a[],row,col);
	
		
		for(int i=0;i<col;i++)
		{
			q.quick(a[][i],0,row-1);
		}
		
		System.out.println("After sorting");
		q.printArray(a[],row,col);
		
	}

}

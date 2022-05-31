package com.exam;

import java.util.*;

public class MatrixMultiply 
{
		public static void main(String a[])
		{
			Scanner sc=new Scanner(System.in);
			int A[][]=new int[10][10];
			int B[][]=new int[10][10];
			int C[][]=new int[10][10];
			int sum=0;
			
			int m,n,p,q;
			System.out.println("Enter row,col of A:");
			m=sc.nextInt();
			n=sc.nextInt();
			
			System.out.println("Enter row,col of B:");
			p=sc.nextInt();
			q=sc.nextInt();
			
			if(n!=p)
			{
				System.out.println("Matrix cannot be multipled");
				return;
			}
			System.out.println("Matrix A:");
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					A[i][j]=sc.nextInt();
				}
				
			}
			
			System.out.println("Matrix B:");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					B[i][j]=sc.nextInt();
				}
				
			}
			
			for(int i=0;i<m;i++)
			{	
				for(int j=0;j<q;j++)
				{
					sum=0;
					for(int k=0;k<n;k++)
					{
						sum+=(A[i][k]*B[k][j]);
					}
					C[i][j]=sum;
			
				}
				
			}
			
			for(int i=0;i<m;i++)
			{	
				for(int j=0;j<q;j++)
				{
					System.out.print(C[i][j]+"\t");
				}
				System.out.println();
			}

		}
}
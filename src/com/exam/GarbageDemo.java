package com.exam;

public class GarbageDemo 
{
	public static void main(String a[])
	{
			Runtime r=Runtime.getRuntime();
			System.out.println("Total Memory:"+r.totalMemory());
			System.out.println("Free Memory:"+r.freeMemory());
			
			int num[]= new int[10];
			for(int i=0;i<10;i++)
			{
				num[i]=10;
			}
			
			System.out.println("Total Memory:"+r.totalMemory());
			System.out.println("Free Memory:"+r.freeMemory());
			
			num=null;
			r.gc();
			System.out.println("Total Memory:"+r.totalMemory());
			System.out.println("Free Memory:"+r.freeMemory());
		
	}

}

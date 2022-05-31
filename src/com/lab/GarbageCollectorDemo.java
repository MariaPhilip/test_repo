package com.lab;

import java.util.*;
import java.io.*;

public class GarbageCollectorDemo
{
		public static void main(String a[])
		{	
			Scanner sc= new Scanner(System.in);
			Runtime r=Runtime.getRuntime();
			
			System.out.println("Total Memory"+r.totalMemory());
			System.out.println("Free Memory"+r.freeMemory());
			
			int s[]= new int[10];
			System.out.println("Enter an array");
			for(int i=0;i<10;i++)
			{
				s[i]=sc.nextInt();
			}
			
			System.out.println("Total Memory"+r.totalMemory());
			System.out.println("Free Memory"+r.freeMemory());
			s=null;
			
			r.gc();
			System.out.println("Total Memory"+r.totalMemory());
			System.out.println("Free Memory"+r.freeMemory());
		}
}

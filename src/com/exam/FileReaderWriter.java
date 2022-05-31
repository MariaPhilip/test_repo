package com.exam;
import java.io.*;
import java. util.*;

public class FileReaderWriter 
{
	public static void main(String a[])
	{	
		String str;int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:");
		str=sc.nextLine();
		
		try
		{
			FileWriter fw= new FileWriter("abc.txt");
			fw.write(str);
			System.out.println("Written Successfully");
			fw.close();
			
			FileReader fr= new FileReader("abc.txt");
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
	
		}
		catch(Exception e)
		{
			
		}
	}
}

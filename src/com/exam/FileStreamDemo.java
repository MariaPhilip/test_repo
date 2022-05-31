package com.exam;

import java.io.*;

public class FileStreamDemo 
{
	public static void main(String a[]) throws IOException,FileNotFoundException
	{	int i;
		try
		{
			FileInputStream f1=new FileInputStream("abc.txt");
			FileOutputStream f2=new FileOutputStream("xyz.txt");
			
			while((i=(f1.read()))!=-1)
			{
				f2.write((char)i);
			}
			
			System.out.println("Written Successfully");
			f1.close();
			f2.close();
			
			FileInputStream f3=new FileInputStream("xyz.txt");
			while((i=(f3.read()))!=-1)
			{
				System.out.println((char)i);
			}
			f3.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("e");
		}
		catch(IOException e)
		{	System.out.println("e");
		}
	}

}

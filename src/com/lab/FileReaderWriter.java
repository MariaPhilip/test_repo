package com.lab;
import java.util.*;
import java.io.*;


public class FileReaderWriter 
{
	public static void main(String a[]) throws IOException
	{		Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string:");
			String s=sc.nextLine();
			int i;
			try
			{	FileWriter fw=new FileWriter("abc.txt");
				fw.write(s);
				/*for(int j=0;j<s.length();j++)
				{
					fw.write(s.charAt(j));
					
					
				}*/
				fw.close();
				System.out.println("Written Successfully");
				
				FileReader fr=new FileReader("abc.txt");
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}
			}
			catch(IOException e)
			{
				System.out.println("Exception"+e);
			}
			
	}
	

}

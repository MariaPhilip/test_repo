package com.lab;

import java.sql.*;
import java.util.*;
public class mysql 
{
		public static void main(String a[])
		{
			try
			{
				Scanner sc=new Scanner(System.in);
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MariaAP","mec","mec");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT* FROM DICTIONARY");
				System.out.println("Enter Word");
				String w=sc.nextLine();
				
				while(rs.next())
				{
					String word =rs.getString("WORD");
					String meaning=rs.getString("MEANING");
					boolean r=word.equals(w);
					
					if(r)
					{
						System.out.println(word+" "meaning);
					}
					con.close();
				}
				catch(Exception e)
				{	System.out.println(e);
				}
			}
				

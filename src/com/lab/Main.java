package com.lab;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
class Animal
{
 Animal()
 {
     System.out.println("Animal");
 }
}

class Dog extends Animal 
{	int num=12;
 Dog()
 { 
	 super();
      System.out.println("Dog");
 }
}
public class Main {
 public static void main(String[] args) 
 {
     Dog d=new Dog();
 
 }
}
package javatraining;

import java.util.Scanner;

public class ScannerBasic {

	public static void main(String[] args) 
	{
		Scanner t= new Scanner(System.in);
		System.out.println("enter a number");
		int num=t.nextInt();
		System.out.println("the number is "+num);
		System.out.println("enter name");
		String name=t.next();
		System.out.println("name is "+name);
		

	}

}

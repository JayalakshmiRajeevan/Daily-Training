package javatraining;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Size of array");
		int size=scan.nextInt();
		int marks[]=new int[size];
		System.out.println("size of array is "+marks.length);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("mark "+i);
			marks[i]=scan.nextInt();
		}
		System.out.println();
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("mark is "+marks[i]);
		}
}
}
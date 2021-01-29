package javatraining;

import java.util.Scanner;

public class Marks 
{

	public static void main(String[] args)
	{
	Scanner t=new Scanner(System.in);
	System.out.println("Enter your mark");
	int mark=t.nextInt();
	if(mark>=90 && mark<=100)
	{
		System.out.println("A grade");
	}
	else if(mark>=70 && mark<=89)
	{
		System.out.println("B grade");
	}
	else if(mark>=50 && mark<=69)
	{
		System.out.println("C grade");
	}
	else
	{
		System.out.println("D grade");
	}
	}
}

package javatraining;

import java.util.Scanner;

public class AgeSalary
{

	public static void main(String[] args) 
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter age and salary");
		int age=t.nextInt();
		int salary=t.nextInt();
		if(age>25 && salary>35000)
		{
			System.out.println("You can apply for loan");
		}
		else
		{
			System.out.println("You can't apply for loan");
		}
	}

}

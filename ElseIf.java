package javatraining;

import java.util.Scanner;

public class ElseIf
{
	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter 1.Deposit  2.Withdraw  3.Balance");
		int choice=t.nextInt();
		if(choice==1)
		{
			System.out.println("Deposit");
		}
		else if(choice==2)
		{
			System.out.println("Withdraw");
		}
		else if(choice==3)
		{
			System.out.println("Balance check");
		}
	}
}

package javatraining;

import java.util.Scanner;

public class SmallestNumber 
{
	public static void main(String[] args)
	{
		int a[]={12,5,4,34,5};
	    int small=a[0];
	    for(int i=0;i<a.length;i++)
	    {
	    	if(small>a[i])
	    	{
	    		small=a[i];
	    	}
	    }
	    System.out.println("Smallest number is "+small);

	}

}

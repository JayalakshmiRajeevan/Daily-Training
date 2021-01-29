package javatraining;
public class ArrayMarks 
{
	public static void main(String[] args)
	{
		int a[]={45,55,34,98,23};
	    int min=a[0];
	    int max=a[0];
	    int total=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	if(min>a[i])
	    	{
	    		min=a[i];
	    	}
	    	else if(max<a[i])
	    	{
	    		max=a[i];
	    	}
	    }
	    System.out.println("Minimum marks "+min);
	    System.out.println("Maximum marks "+max);
	    for(int i=0;i<a.length;i++)
	    {
	    	total=total+a[i];
	    }
	    System.out.println("Total marks is "+total);
	    if(min>45)
    	{
    		System.out.println("Fail");
    	}
    	else
    	{
    		System.out.println("Pass");
    	}
	}
}

package javatraining;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int a[]={3,2,5,9,7,5};
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}

}

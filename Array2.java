package javatraining;
public class Array2 
{
	public static void main(String[] args) 
	{
		int a[]={3,4,5,7,8};
		int esum=0;
		int ecount=0;
		int osum=0;
		int ocount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				esum=esum+a[i];
				ecount++;
			}
			else
			{
				osum=osum+a[i];
				ocount++;
			}
		}
		System.out.println("even count "+ ecount);
		System.out.println("even sum "+ esum);
		System.out.println("odd count "+ ocount);
		System.out.println("odd sum "+ osum);
	}
}

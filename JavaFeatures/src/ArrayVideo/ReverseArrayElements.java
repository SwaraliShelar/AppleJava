package ArrayVideo;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayElements
{
void reverse(int a[])
{
	System.out.println("Array elements in reverse order:");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Length of array is:"+a.length);
		System.out.println("enter the array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		ReverseArrayElements r= new ReverseArrayElements();
		r.reverse(a);
	}
}

import java.io.*;
import java.util.*;
import java.lang.*;
public class Subarray
{
public static void main(String args[])
{
	sc = new Scanner(System.in);
	int n,n1,i,j,k,s,c=0;
	System.out.println("Enter the number of elements(subset1 & subset2)");
	n=sc.nextInt();
	n1=sc.nextInt();
	int arr1[]=new int[n];
	System.out.println("Subset 1 :");
	for(i=0;i<n;i++)
	{
		arr1[i]=sc.nextInt();
	}
	int arr2[]=new int[n1];
	System.out.println("Subset 2 :");
	for(j=0;j<n1;j++)
	{
		arr2[j]=sc.nextInt();
	}
	for(k=0;k<arr1.length;k++)
	{
		for(s=0;s<arr2.length;s++)
		{
			if(arr1[k]==arr2[s]) //&& arr1[k+1]==arr2[s+1])
			{
				c++;
			}
		}
	}
if(c==arr2.length)
{
	System.out.println("array1 is a subset of array2");

}
		else
			{
				System.out.println("array1 is not a subset of array2");
			}
}
}

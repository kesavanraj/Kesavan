import java.io.*;
import java.util.*;
import java.lang.*;
public class FirstArray
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int a;
	System.out.println("Enter the number of elements you want?");
	a=sc.nextInt();
	int n[]=new int[a];
	int r[]=new int[a];
	System.out.println("Enter the array of elements");
	
	for(int i=0;i<a;i++)
	{
		n[i]=sc.nextInt();
	}
	int a1=0;
	for(int k=0;k<n.length;k++)
    for(int j=k+1;j<n.length;j++)

		if(n[k]==n[j])
		{
			r[a1++]=n[j];
		}
			System.out.println("The first array element is repeated numbers: "+r[0]);
}
	}

import java.io.*;
import java.util.*;
import java.lang.*;
public class squarecheck
{
public static void main(String[] args) 
{
			int[] a=new int[5];
			int[] b=new int[5];
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the dimensions");
	for(int i=0;i<4;i++)
	{
		a[i]=s.nextInt();
		b[i]=s.nextInt();
	}
	if(a[0]==b[3]&&b[0]==a[1]&&b[1]==a[2]&&b[2]==a[3])
	{
		System.out.println("Square");
	}
	else
	{
	System.out.println("not Square"); }
		}

	}



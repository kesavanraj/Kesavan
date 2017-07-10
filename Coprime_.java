package string;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Coprime {
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,x = 0,y = 0,count;
		System.out.println("Enter two integers");
		x=sc.nextInt();
		y=sc.nextInt();
		a=x;
		b=y;
		while(y!=0)
		{
			count=x%y;
			x=y;
			y=count;
		}
		if(x==1)
			System.out.println("Co-prime");
		else
			System.out.println("Not a Co-prime");
	}
	}



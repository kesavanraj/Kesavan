import java.io.*;
import java.util.*;
import java.lang.*;
public class Reverse 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s;
	int i;
	System.out.println("Enter the string");
	s=sc.nextLine();
	String s1[]=s.split(" ");
	String output=" ";
	for(i=s1.length-1;i>=0;i--)
	{
	output =output+(s1[i]+" ");
	}
	System.out.println(output.trim());
	}
	}



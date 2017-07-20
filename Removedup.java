import java.io.*;
import java.util.*;

public class Removedup
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String str;
	char c;
	String a="";
	System.out.println("Enter the string");
	str=sc.nextLine();
	int len=str.length();
	for(int i=0;i<len;i++)
	{
	c=str.charAt(i);
	if(c!=' ')
	a=a+c;
	str=str.replace(c,' ');
	}
	System.out.println("The reverse string is : "+a);
	}
	}


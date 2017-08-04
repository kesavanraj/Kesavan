import java.io.*;
import java.util.*;
public class vowelremove {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1,rev="",rev1="";
		System.out.println("Enter the string");
		String org=sc.nextLine();
		int len2=org.length();
		for(int j=len2-1;j>=0;j--)
			rev1=rev1+org.charAt(j);
		System.out.println("output 1:"+rev1);
		s1=org.replaceAll("[aeiouAEIOU]", "");
		int len=s1.length();
		for(int i=len-1;i>=0;i--)
			rev=rev+s1.charAt(i);
		System.out.println("output 2 " +rev);
    }
    }


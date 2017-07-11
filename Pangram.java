import java.io.*;
import java.util.*;
import java.lang.*;
public class Pangram
{
public static void main(String args[])throws IOException
{
Scanner ss = new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String s1=ss.nextLine();
	        char c[]=s1.toLowerCase().toCharArray();
	        char c1[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
	        int cc=0;
	        for(int i=0;i<c1.length;i++)
	        {
	            for(int j=0;j<c.length;j++)
	            {
	                if(c1[i]==c[j])
	                {
	                    cc++;
	                    break;
	                }
	            }
	        }
	        if(cc==26)
	        {
	            System.out.println("The given string is a pangram.");
	        }
	        else
	        {
	            System.out.println("The given string is not a pangram.");
	        }
	        
	    }
	}

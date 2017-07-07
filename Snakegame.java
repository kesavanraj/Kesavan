import java.io.*;
import java.util.*;
import java.lang.*;
public class Snakegame
{
public static void main(String args[])throws IOException
{
Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		  int n=s.nextInt();
		  int i,j;
		  for(i=0;i<n;i++)
		  {
		   if(i==0||i==n-1)
		    for(int k=0;k<n;k++)
		      System.out.print("* ");
		   else
		   {
		    for(j=0;j<n;j++)
		    {
		      if(j==0||j==n-1)
		       System.out.print("* ");
		      else
		       System.out.print("  ");
		    }
		    
		   }
		   System.out.println();
		  }
		 }
		}

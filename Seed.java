import java.io.*;
import java.util.*;
import java.lang .*;
public class Seed
{
public static void main(String args[])throws IOException
{
Scanner s=new Scanner(System.in);
		System.out.println("Enter the number x:");
		int x=s.nextInt();;
		System.out.println("Enter the number which you want to check seed or not");
		int y=s.nextInt();;
		int temp;
		temp=x;
		if(temp%10==temp)
		temp=temp*temp;
		else
		while(x>0)
		{
		temp=(x%10)*temp;
		x=x/10;
		}
		if(temp==y)
    {
			System.out.println("Yes it is a seed of X ");
		}
			else
      {
				System.out.println("No it is not a seed of X");
			}
		s.close();
		}
	}

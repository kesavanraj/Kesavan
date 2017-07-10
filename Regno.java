import java.io.*;
import java.util.*;
import java.lang.*;
public class Regno 
{
      public static void main(String[] args) 
      {
			Scanner scan=new Scanner(System.in);
			System.out.println("ENTER THE SIZE OF ARRAY");
			int n=scan.nextInt();
			int[] a=new int[n];
			System.out.println("ENTER THE ELEMENTS FOR ARRAY:");
			for(int i=0;i<n;i++)
			{
				a[i]=scan.nextInt();
			}
			Arrays.sort(a);
			for(int i=0;i<n-1;i++)
			{
				if(a[i]==a[i+1])
				{
					System.out.println("THE REPEATING ELEMENTS IN ARRAY IS : "+a[i]);
				}
			}

		}

	}



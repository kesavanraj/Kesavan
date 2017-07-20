package strings;
import java.io.*;
import java.util.*;
public class Target 
{
	public static void main(String[] args)
  {
		Scanner sc=new Scanner(System.in);
		int sum=0,count=0,ans=0;
		System.out.println ("Enter the size of array");
		int a=sc.nextInt();
		int[] n=new int[a];
		System.out.println ("Enter the elements in the array");
		for(int i=0;i<a;i++)
    {
			n[i]=sc.nextInt();
		}
		System.out.println ("Target");
		int t=sc.nextInt();
		for(int j=0;j<a;j++)
    {
			for(int k=0;k<a;k++)
      {
				sum=0;
				if(j!=k)
        {
					sum=n[j]+n[k];
					if(sum==t)
          {
						ans=sum; 
						count++;
						break;
					}
				}
			}
		}
		if(count!=0 && t==ans)
			System.out.println("Target achieved "+ans);
		else
			System.out.println("Not achieved");
		
	}

}


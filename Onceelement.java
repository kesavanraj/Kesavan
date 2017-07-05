import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;

public class onceelement {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
    	System.out.println("enter total no of element");
    	int x=scan.nextInt(),i=0,j=0,flag=0,cnt=0;
    	int a[]=new int [x];
    	int b[]=new int [x];
    	for(i=0;i<x;i++)
    		a[i]=scan.nextInt();
    	for(i=0;i<x;i++)
    	{
    		for(j=i+1;j<x;j++)
    		{
    			if(a[i]==a[j])
    			{
    				b[cnt]=a[i];
    				
    				cnt++;
    			}
    		}
    	}
    	
    	for(i=0;i<x;i++)
    	{
    		for(j=0;j<=cnt;j++)
    		{
    			if(a[i]==b[j])
    				flag=1;
    		}
    		if(flag==0)
    			System.out.println(a[i]);
    		flag=0;
    	}
    		
    		}

	}

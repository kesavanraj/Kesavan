import java.io.*;
import java.util.*;
import java.lang.*;
public class NearZerosum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,pos=0,neg=0,min,sum;
System.out.println("Enter the array of the elements");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
min=Math.abs(a[0]+a[1]);
for(int j=0;j<n;j++)
{
for(int k=j+1;k<n;k++)
{
sum=Math.abs(a[j]+a[k]);
if(sum<min)
{
neg=j;
pos=k;
min=sum;
}
}
}
System.out.println("closest is closest to zero is : ");
System.out.println(a[neg]);
System.out.println(a[pos]);
}
}

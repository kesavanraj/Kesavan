import java.io.*;
import java.util.*;
public class Primenumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,num,i,count=0;
System.out.println("Enter the starting number");
a=sc.nextInt();
System.out.println("Enter the ending number");
b=sc.nextInt();
for(num=a;num<=b;num++)
{
for(i=2;i<num;i++)
{
if(num%i==0)
{
count=0;
break;
}
else
{
count=1;
}
}
if(count==1)
{
System.out.println(num+" ");
}
}
}
}

import java.io.*;
import java.util.*;
public class Even
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,k;
System.out.println("Enter the starting number");
i=sc.nextInt();
System.out.println("Enter the ending number");
j=sc.nextInt();
System.out.println("Even numbers are:");
for(k=i;k<=j;k++)
{
if(k%2==0)
{
System.out.print(k+" ");
}
}
}
}

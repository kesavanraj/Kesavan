import java.io.*;
import java.util.*;
import java.lang.*;
public class Prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,icount=0;
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
for(i=2;i<a;i++)
{
if(num%i==0)
{
count++;
break;
}
}
if(count==0)
{
System.out.println("It is a prime number");
}
else
{
System.out.println("It is not a prime number");
}
}
}

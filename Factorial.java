import java.io.*;
import java.util.*;
import java.lang.*;
public class Factorial
{
public static void main (String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,fact=1;
System.out.println("Enter the number");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("The factorial is : "+fact);
}
}

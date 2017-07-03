import java.io.*;
import java.util.*;
import java.lang.*;
public class Factnumber
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,count,fact=1;
System.out.println("Enter the number");
a=Integer.parseInt()br.readLine());
for(count=1;count<=a;count++)
{
fact=fact*count;
}
System.out.pritnln("Factorial of the number is "+fact);
return 0;
}
}

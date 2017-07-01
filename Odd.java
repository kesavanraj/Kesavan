import java.io.*;
import java.util.*;
import java.lang.*;
public class Odd
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,i;
System.out.println("Enter the first number");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the last number");
b=Integer.parseInt(br.readLine());
for(i=a;i<b;i++)
{
if(i%2!0)
{
System.out.println(i);
}
return 0;
}
}
}

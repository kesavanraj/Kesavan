import java.io.*;
import java.util.*;
import java.lang.*;
public class Numberreverse
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,rev=0;
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
while(a)
{
b=a%10;
rev=rev*10+b;
a=a/10;
}
System.out.println(rev);
}
}

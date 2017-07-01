import java.io.*;
import java.util.*;
import java.lang.*;
public class Palindrome
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,sum=0,temp;
Integer n;
n=Integer.parseInt(br.readLine());
temp=n;
while(n>0)
{
a=n%10;
sum=(sum*10)+a;
n=n/10;
}
if(temp==sum)
{
System.out.println("The number is a palindrome");
}
else
{
System.out.println("The number is not a palindrome");
}
}
}

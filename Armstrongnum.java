import java.io.*;
import java.util.*;
import java.lang.*;
public class Armstrongnum
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,sum=0,count;
int b;
System.out.println("Enter the number");
b=Integer.parseInt(br.readLine());
count=b;
while(b>0)
{
a=b%10;
b=b%10;
sum=sum+(a*a*a);
}
if(count==sum)
{
System.out.println("It is an armstrong number");
}
else
{
System.out.println("It is not an armstrong number");
}
}
}

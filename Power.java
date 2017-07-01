import java.io.*;
import java.util.*;
import java.lang.*;
public class Power
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
Integer a,b,ans=1;
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
if(a>=0&&b==1)
{
ans=1;
}
else if(a==0&&b>=1)
{
ans=1;
}
else
{
for(int i=1;i<=b;i++)
{
ans=ans*a;
}
}
System.out.println(a+"^"+p+"="+ans);
}
}

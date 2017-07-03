import java.io.*;
import java.util.*;
import java.lang.*;
public class Longprefix
{
public static void main(String ar[])throws Exception
{
Scanner s=new Scanner(System.in);
int b,c;
b=sc.nextInt();
String a[]=new String[100];
for(int i=0;i<b;i++)
{
a[i]=sc.next();
}
String long,check;
if(a.length>0)
long=a[0];
for(int i=1;i<a.length;i++)
{
check=a[i];
for(c=0;c<Math.min(long.length(),a[i].length());c++)
{
if(long.charAt(c)!=check.charAt(c))
break;
}
long=a[i].subString(0,c);
}
System.out.println("longest prefix is:"+long);
}
}

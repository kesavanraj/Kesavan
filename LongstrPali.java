import java.io.*;
import java.util.*;
import java.lang.*;
public class LongstrPali
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int i,j;
System.out.println("Enter the string");
String str=sc.next();
ArrayList<Integer> list1=new ArrayList<Integer>();
ArrayList<String> list2=new ArrayList<String>();
for(i=0;i<str.length();i++)
{
for(j=i;j<str.length();j++)
{
StringBuffer sb=new StringBuffer(str.substring(i,j));
sb.reverse();
String s=new String(sb);
if(s.equals(str.substring(i,j)))
{
if(s.length()!=1)
{
list1.add(s.length());
list2.add(s);
}
}
}
}
Collections.sort(list1);
int num=list1.get(list1.size()-1);
for(String x:list2)
{
if(x.length()==num)
{
System.out.println(x);
}
}
}
}

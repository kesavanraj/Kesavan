import java.io.*;
import java.util.*;
import java.lang.*;
public class Swapstring
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String");
String in=br.readLine();
StringBuilder sb=new StringBuilder();
char[] ch=in.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(i%2==0)
{
if((i+1) < ch.length)
{
sb.append(ch[i+1]);
}
sb.append(ch[i]);
}
}
System.out.println("After swapping the string: "+sb);
}
}

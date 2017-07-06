import java.io.*;
import java.util.*;
import java.lang.*;
public class Stringreverse
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
System.out.println("Enter the string");
s=br.readLine();
String x[]=str.split(" ");
String output=" ";
for(int i=x.length-1;i>=0;i--)
{
output =output+(x[i]+" ");
}
System.out.println("Reverse words are: "+output.trim());
}
}

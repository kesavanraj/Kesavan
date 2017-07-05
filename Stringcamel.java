import java.io.*;
import java.util.*;
import java.lang.*;
public class Stringcamel
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String");
String input=br.readLine();
String output=" ";
char camel=input.charAt(0);
output=output+Character.toUpperCase(camel);
for(int i=1;i<input.length();i++)
{
char c=input.charAt(i);
char c1=input.charAt(i-1);
if(c1==' ')
{
output=output+Character.toUpperCase(c);
}
else
{
output=output+Character.toLowerCase(c);
}
}
System.out.println("Before string conversion: "+input);
System.out.println("After string to camelcase conversion: "+output);
}
}

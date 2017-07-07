import java.io.*;
import java.util.*;
import java.lang.*;
public class Encoding
{
public static void main(String args[])throws IOException
{
Scanner sc = new Scanner(System.in);
String a=sc.next();
String b=sc.next();
String c="",d="";
		char h;
		int v=1;
		int i=0,j=0;
		for(i=0;i<a.length();i++)
    {
			h=a.charAt(i);
			if(h>='a'&&h<='p')
      {
			c+=(char)(h+10);
		}
    else
    {
			if(h>='r'&&h<='z')
      {
				v=0;
				while((122-h+v)!=10)
        {
					v++;
				}
				
				 c+=(char)(v+97);					 
			}
		}
	}
  for(i=1;i<b.length()-1;i++)
  {
		h=b.charAt(i);
		if(h>='a'&&h<='r')
    {
		d+=(char)(h+10);
	}
  else
  {
		if(h>='s'&&h<='z')
    {
			v=0;
			while((122-h+v)!=9)
      {
				v++;
			}
			 d+=(char)(v+97);					 
		}
	}
}
		System.out.println(c+" "+b.charAt(0)+d+b.charAt(b.length()-1));
}
}

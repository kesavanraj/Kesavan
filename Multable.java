import java.io.*;
import java.util.*;
import java.lang.*;
public class Multable
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i=1,j=1,a,b,c;
System.out.println("Enter the number");
a=Integer.parseInt(br.readLine());
System.out.println("Enter last number");
b=Integer.parseInt(br.readLine());
while(i<=b)
{
c=a*j;
System.out.println(j+" * "+a+" = "+c);
j++;
i++;
}
}
}

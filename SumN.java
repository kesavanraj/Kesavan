import java.io.*;
import java.util.*;
import java.lang.*;
public class SumN
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,sum=0;
a=Integer.parseInt(br.readLine());
for(int i=0;i<=a;i++)
{
sum=sum+i;
}
return sum;
}
}

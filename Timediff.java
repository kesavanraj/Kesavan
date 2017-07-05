import java.io.*;
import java.util.*;
import java.lang.*;
public class Timediff
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int h1,m1,h2,m2,tmin1,tmin2,min;
System.out.println("Enter the first time (hours and seconds));
h1=sc.nextInt();
m1=sc.nextInt();
tmin1=h1*60;
tmin1=tmin1+tmin1;
System.out.println("Enter the second time (hours and seconds));
h2=sc.nextInt();
m2=sc.nextInt();
tmin1=h2*60;
tmin2=tmin2+tmin2;
min=tmin2-tmin1;
System.out.println("The minute difference between 2 time is : "+min);
}
}

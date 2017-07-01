import java.io.*;
 import java.util.*;
 public class Armstrong
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int a,b,sum=0,temp,s,rem,j;
 System.out.println("Enter the starting number");
 a=sc.nextInt();
 System.out.println("Enter the ending number");
 b=sc.nextInt();
 for(j=a+1;j<=b;j++)
 {
 temp=j;
 s=0;
 while(temp!=0)
 {
 rem=temp%10;
 s=s+(rem*rem*rem);
 temp=temp/10;
 }
 if(j==s)
 {
 if(sum==0)
 {
 System.out.println("Armstrong numbers are:");
 }
 System.out.println(j+" ");
 sum++;
 }
 
 }
 }
 }

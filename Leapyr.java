import java.util.Scanner;

public class Leapyr
{
    public static void main(String args[])
    {
       int a;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Year : ");
       a = scan.nextInt();
	   
       if((a%4 == 0) && (a%100!=0))
       {
           System.out.print("This is a Leap Year");
       }
       else if(a%100 == 0)
       {
           System.out.print("This is not a Leap Year");
       }
       else if(a%400 == 0)
       {
           System.out.print("This is a Leap Year");
       }
       else
       {
           System.out.print("This is not a Leap Year");
       }
    }
}

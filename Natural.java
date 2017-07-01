import java.io.*;
import java.util.*;
import java.lang.*;
public class Natural
{
public static void main(String args[])throws IOException
{
int x, a = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while(a <= x)
        {
            sum = sum +a;
            a++;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
    } 
}

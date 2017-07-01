import java.io.*;
import java.util.*;
import java.lang.*;
public class Digits
{
public static void main(String args[])throws IOException
{
int num, i=0;
        System.out.print("Enter a Number:");
        Scanner get = new Scanner(System.in);
        num = get.nextInt();
        while(num>0)
        {
            num=num/10;
            i++;
        }
        System.out.println();
        System.out.println("Number of Digits present : "+i);
    }
}

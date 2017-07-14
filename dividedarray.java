import java.io.*;
import java.util.*;
public class dividedarray
{
private static Scanner s;

		public static void main(String[] args)
    {
			s = new Scanner(System.in);
			System.out.println("Enter the number Seperated by Comma");
			String s1 = s.next();
			String sr[] = s1.split(",");
			int num1 = 0;
			int count1 = 0, count2 = 0;
			int sum1 = 0, sum2 = 0;
			String sc1 = "";
			String sc2 = "";
			if (sr.length % 2 == 0)
      {
				num1 = sr.length / 2;
			} else {
				num1 = (sr.length / 2) + 1;
			}
			for (int i = 0; i < num1; i++) 
      {
				count1++;
				sum1 += Integer.parseInt(sr[i]);
				sc1 += sr[i] + " ";
			}
			for (int i = num1; i < sr.length; i++) 
      {
				count2++;
				sum2 += Integer.parseInt(sr[i]);
				sc2 += sr[i] + " ";
			}
			if (sum1 / count1 == sum2 / count2)
      {
				System.out.println("The divided array is:");
				System.out.println("[" + sc1 + "]" + "[" + sc2 + "]");
			} else
      {
				System.out.println("Result:");
				System.out.println("Not Possible");
			}

		}

	}



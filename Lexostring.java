import java.io.*;
import java.util.*;
import java.lang.*;
public class Lexostring
{
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the string:");
			String s1 = s.next();
			String sr = "";
			for (int i = 0; i < s1.length() - 1; i++)
			{
				if (s1.charAt(i) < s1.charAt(i + 1)) 
				{
					sr += s1.charAt(i);
				}
			}
      System.out.println("The Lexo string is:");
			System.out.println(sr + s1.charAt(s1.length() - 1));
			}

	}


import java.io.*;
import java.util.*;
public class longsubstring {
public static void main(String[] args) 
    {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=s.nextLine();
			String str1="";
			int i;
			str1=str1+str.charAt(0);
	for(i=1;i<str.length();i++)
  {
				str1=str1+str.charAt(i);
				if(str.charAt(0)==str.charAt(i))
        {
					break;
				}
			}
	int n1=str1.length();
			System.out.print("The longest substring is :");
			System.out.println(str1.substring(0,n1-1));
			System.out.println("The length is :"+(n1-1));

		}

	}


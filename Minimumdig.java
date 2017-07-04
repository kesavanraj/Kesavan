import java.io.*;
import java.util.*;
import java.lang.*;
public clss Minimumdig
{
  public static void main(String args[])throws IOException
{
	  Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String sr = "";
		String rs = "";
		int a = sc.nextInt();
		for (int i = 0; i < s1.length(); i++) {
			sr += s1.charAt(i) + " ";
		}
		String sar[] = sr.split(" ");
		Arrays.sort(sar);
		for (int i = 0; i < sar.length; i++) {
			rs += sar[i];
		}
		StringBuffer sb = new StringBuffer(rs);
		for (int i = a; i > 0; i--) {
			sb.deleteCharAt(sb.length() - 1);
		}
		System.out.println(sb);

	}
}

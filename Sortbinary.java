import java.io.*;
import java.util.*;
import java.lang.*;
public class Sortbinary
{
public static void main(String args[])throws IOException
{
Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		sc.close();
		String sr[] = s1.split(",");
		byte b[] = new byte[sr.length];
		for (int i = 0; i < sr.length; i++) {
			b[i] = Byte.parseByte(sr[i]);
		}
		Arrays.sort(b);

		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}
	}

}

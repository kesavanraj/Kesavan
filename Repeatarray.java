import java.io.*;
import java.util.*;
import java.lang.*;
public class Repeatarray
{
public static void main(String args[])throws IOException
{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		int a = s.nextInt();
		System.out.println("Enter Elements");
		int ar[] = new int[a];
		int arr[] = new int[ar.length];
		for (int i = 0; i < a; i++) {
			ar[i] = s.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					arr[i] = ar[i];
				}
			}
		}
		System.out.print("The Repeated Numbers : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				System.out.print(arr[i] + " ");
		}
	}
}

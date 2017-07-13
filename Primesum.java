import java.io.*;
import java.util.*;
public class Primesum {

	public static void main(String[] args) {
		String str1 = "";
		String str2 = "";
		int sum1 = 0;
		int sumr = 0;
		for (int i = 1; i < 100; i++) {
			boolean f = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					f = false;
					break;
				}
			}
			if (f)
				str1 += i + " ";
		}
		String sr[] = str1.split(" ");
		for (int i = 0; i < sr.length; i++) {
			for (int j = i + 1; j < sr.length - 1; j++) {
				int sum = Integer.parseInt(sr[i]) + Integer.parseInt(sr[j]);
				if (sum > 9) {
					sum = sum % 10;
					sum1 = sum / 10;
					sumr = sum + sum1;
					//System.out.println(sumr);
					if (sumr == Integer.parseInt(sr[j + 1])) {
						str2 += sr[j + 1] + " ";
						//System.out.println(str2);
					}
				} else {

					if (sum == Integer.parseInt(sr[j + 1])) {
						str2 += sr[j + 1] + " ";
					}
				}
			}
		}
		System.out.println(str2);
	}

}

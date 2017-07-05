import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Dictionary {

	public static void main(String[] args) {
		ArrayList<String> arl=new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of words for dictionary:");
		int n=scan.nextInt();
		System.out.println("Enter the words for dictionary");
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			s[i]=scan.nextLine();
		}
		scan.nextLine();
		Arrays.sort(s);
		System.out.println("Enter the sentence:");
		String sen=scan.nextLine();
		for(String s1:sen.split(" ")){
			int flag=0;
			for(String s2:s){
				if(s1.equalsIgnoreCase(s2)){
					flag=1;
				}
			}
			if(flag==0)
				arl.add(s1);
			}
		for(String dict:s){
			for(String sente:arl){
				int len=0;
				char c[]=sente.toCharArray();
				for(int k=0;k<c.length;k++){
					if(dict.contains(String.valueOf(c[k]))){
					len++;
					}
					if(len==c.length){
						System.out.println("THE SUGGESTED WORD FOR \""+sente+"\" IS \""+dict+"\"");
					}
			}
		}

	}

}
}

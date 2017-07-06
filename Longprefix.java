import java.io.*;
import java.util.*;
import java.lang.*;


public class Longprefix {

	public static void main(String[] args) throws IOException{
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		Integer n,i,min=0,j,count,max=0;
		ArrayList<String> al = new ArrayList<String>();
		
		n = Integer.parseInt(bb.readLine());
		String[] s = new String[n];
		Integer[] ii = new Integer[n];
		String[] s1 = new String[n];
		for(i=0;i<s.length;i++){
			s[i] = bb.readLine();
			al.add(s[i]);
		}
		
		Collections.sort(al);
		
		ii[0] = 0;
		s1[0] = "";
		for(i=0;i<al.size()-1;i++){
			count = 0;
			min = Math.min(al.get(i).length() , al.get(i+1).length());
			for(j=0;j<min;j++){
				if(al.get(i).charAt(j) == al.get(i+1).charAt(j))
					count++;
				else
					break;
			}
			ii[i+1] = count;
			s1[i+1] = al.get(i).substring(0,count);
			//System.out.println(count +","+s1[i+1]);
		}
		
		for(i=0;i<ii.length-1;i++)
			max = Math.max(max,ii[i+1]);
		//System.out.println("max = "+max);
		
		for(i=0;i<s1.length;i++){
			if(max == ii[i])
				System.out.println(s1[i]);
		}
	}

}

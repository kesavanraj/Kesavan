import java.io.*;
import java.util.*;
import java.lang.*;
public class happy {
public static void main(String[] args) throws IOException
{
BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the number : ");
		Integer a = Integer.parseInt(bb.readLine());
		System.out.println(happpy(a));
		
	}

	private static String happpy(Integer a)
  {
		Integer aa = a,val = 0,value = a;
		while(aa>=0)
    {
			a = 0;
			while(aa>9)
      {
				val = aa%10;
				a += (val*val);
				aa = aa/10;
			}
			a += (aa*aa);
			aa = a;
			System.out.println(aa);
			if(aa == 1)
				aa = -1;
			if(aa == 4)  
				break;
		}
		
		if(aa == 1)
			return String.valueOf(value)+" is a happy number";
		else
			return String.valueOf(value)+" is not a happy number";
	}
}

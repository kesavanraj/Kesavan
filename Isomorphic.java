import java.io.*;
import java.util.*;
import java.lang.*;
public class Isomorphic
{
public static void main(String args[])throws IOException
{
    	String s1,s2;
        char c1[],c2[];
        int flag=0;
        System.out.println("Enter the two string to compare isomorphic");
        Scanner obj=new Scanner(System.in);
        s1=obj.next();
         s2=obj.next();
         c1=s1.toCharArray();
        c2=s2.toCharArray();
       if(s1.length()==s2.length())
     for(int i=0;i<s1.length();i++){
     for(int j=i+1;j<s1.length();j++)
{	
    	 if(c1[i]==c1[j]&&c2[i]==c2[j])
	{
    		  flag=1;
	
	}

	
}
}
      if(flag==1)
       System.out.println("it is isomorphic");
      else
      System.out.println("it is not isomorphic");
      obj.close();
}
}

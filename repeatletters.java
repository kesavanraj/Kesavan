import java.io.*;
import java.util.*;
public class repeatletters 
{
	public static void main(String[] args)throws IOException
  {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String a=in.nextLine();
        int n=a.length();
        int i,j,count,len1=1;
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>(); 
        for(i=0;i<n;i++)
        {
            count=0;
            for(j=i;j<n;j++)
            {
                if((a.substring(i,i+1) ).equals(a.substring(j,j+1)))
                {
                    count++;
                }
                hm.put(count,(a.substring(i,i+1)));
            }
        }
       
        for(Map.Entry<Integer, String> obj: hm.entrySet())
        {
            if(len1==hm.size())
            System.out.println(obj.getValue()+" is greatest letter repeated at the string and it is repeted for "+obj.getKey()+" times");
            len1++;
        }
       
       
    }
}

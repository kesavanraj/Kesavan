	import java.io.*;
  import java.util.*;
  import java.lang.*;
	public class WorkingDay 
  {
	     public static void main(String[] args)throws IOException
       {
	    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	 System.out.println("Enter the day");
	    	 String s=br.readLine();
	    	 if(s.equalsIgnoreCase("Sunday")||s.equalsIgnoreCase("Saturday"))
	    		 System.out.println("False");
	    	 else if(s.equalsIgnoreCase("monday")||s.equalsIgnoreCase("tuesday")||s.equalsIgnoreCase("wednesday")||
	    			 s.equalsIgnoreCase("thursday")||s.equalsIgnoreCase("friday"))
	    		 System.out.println("True");
	    	 else
	    		 System.out.println("Invalid Day");
	     }
	}


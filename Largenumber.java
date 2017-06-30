import java.util.Scanner;

class Largenumber
{
public static void main(String[] args) 
{
int a1,a2,a3,largest;
Scanner s=new Scanner(System.in);
System.out.println("Enter any three numbers: ");
a1=s.nextInt();
a2=s.nextInt();
a3=s.nextInt();

if(a1>=a2 && a1>=a3) 
{
System.out.println("Largest number: "+a1);
}
if(a2>=a1 && a2>=a3) 
{
System.out.println("Largest number: "+a2);
}
if(a3>=a1 && a3>=a2) 
{
System.out.println("Largest number: "+a3);
}
}
}

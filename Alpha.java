import java.util.Scanner;

public class Alpha
{
    public static void main(String args[])
    {
        char c;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Character : ");
        c= scan.next().charAt(0);
		
        if((c>='a' && c<='z') || (c>='A' && c<='Z'))
        {
            System.out.print(c + " is an Alphabet");
        }
        else
        {
            System.out.print(c + " is not an Alphabet");
        }
    }
}

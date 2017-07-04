import java.io.*;
import java.util.*;
import java.lang.*;
public class colorgrid
{
public static void main(String args[])throws IOException
{
char grid[][]=new char[100][100];
int m,n;
void getsize()
{
System.out.println("Enter the M * N of the grid");
Scanner s=new Scanner(System.in);
m=s.nextInt();
n=s.nextInt();
s.close();
}
void color()
{
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(j%2==0)
			{
				grid[i][j]='black
			}
			else
			{
				grid[i][j]='white
			}
		}
	}
}
public void main(String args[])
{
	this.getsize();
	this.color();
    char gr[][]=grid;
	for(char[] g:gr)
	{
	System.out.println(g);
	}
}
}

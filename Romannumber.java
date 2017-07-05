import java.io.*;
import java.util.*;
import java.lang.*;
public class Romannumber
{
public static void main(String args[])throws IOExceptions
{
String romanNumeral;
	int decimalNum=0; 
	Scanner s = new Scanner(System.in);
	System.out.print("Enter a Roman number: ");
	romanNumeral = s.nextLine();
	romanNumeral = romanNumeral.toUpperCase();
	int l=  romanNumeral.length();
	int num=0;
	int previousnum = 0;
	for (int i=l-1;i>=0;i--)
	{ 
	char x =  romanNumeral.charAt(i);
	x = Character.toUpperCase(x);
	switch(x)
	{  
	case 'I':
	previousnum = num;
	num = 1;
    break; 
	case 'V':
	previousnum = num;
	num = 5;
	break;
	case 'X':
	previousnum = num;
	num = 10;
	break;
	case 'L':
	previousnum = num;
	num = 50;
	break;
	case 'C':
	previousnum = num;
	num = 100;
	break;
	case 'D':
	previousnum = num;
	num = 500;
	break;
	case 'M':
	previousnum = num;
	num = 1000;
	break;
	}           
	if (num<previousnum)
	decimalNum= decimalNum-num;
	else
	decimalNum= decimalNum+num;
	}
	System.out.println ("The equivalent of the Roman numeral "+romanNumeral+" is "+decimalNum);
	}        
  }

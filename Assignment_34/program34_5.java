////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Display
//    Description:          Used to display character's ASCII value in decimal, octal and hexadecimal
//    Input:                Character
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 05/12/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void Display(char ch)
	{
		if(ch >= 'a' && ch <= 'z')
		{
			System.out.printf("Decimal: %d\tOctal: %o\tHexadecimal: %x\n", (int)ch, (int)ch, (int)ch);
			// java madhe ya format specifiers la integer madhe type cast karayla lagta
			// karan te integer value expect kartat
		}
		else
		{
			System.out.printf("Decimal: %d\tOctal: %o\tHexadecimal: %X\n", (int)ch, (int)ch, (int)ch);
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program34_5
{
	public static void main(String A[])
	{
		char cValue = '\0';
		
		System.out.println("Enter the character: ");

		Scanner sobj = new Scanner(System.in);

		cValue = sobj.next().charAt(0);

		Logic lobj = new Logic();
		
		lobj.Display(cValue);
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Testcases successfully handled by the application
//
//    Input1:   a        Output:   Decimal: 97    Octal: 141    Hexadecimal: 61
//
//    Input2:   Z        Output:   Decimal: 90    Octal: 132    Hexadecimal: 5A
//
//    Input3:   5        Output:   Decimal: 53    Octal: 65     Hexadecimal: 35
//
//    Input4:   @        Output:   Decimal: 64    Octal: 100    Hexadecimal: 40
//
//    Input5:   m        Output:   Decimal: 109   Octal: 155    Hexadecimal: 6d
//
/////////////////////////////////////////////////////////////////////////////////////////////////

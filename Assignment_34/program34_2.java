////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/Display
//    Description:          Used to display upper character in lower case and vice versa.
//							Or if not alphabet then print as it is.
//    Input:                Character
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 05/12/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	public void Display(char ch)
	{
		if((ch >= 'a') && (ch <= 'z'))
		{
			System.out.printf("%c\n", ch - 32);
		}
		else if((ch >= 'A') && (ch <= 'Z'))
		{
			System.out.printf("%c\n", ch + 32);
		}
		else
		{
			System.out.printf("%c\n", ch);
		}
	}
}

class program34_2
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
//    Input1:  a          Output:  A
//    Input2:  Z          Output:  z
//    Input3:  m          Output:  M
//    Input4:  G          Output:  g
//    Input5:  @          Output:  @
/////////////////////////////////////////////////////////////////////////////////////////////////

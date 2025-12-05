////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/ChkDigit
//    Description:          Used to check if given character is a digit or not
//    Input:                Character
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 05/12/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	public Boolean ChkDigit(char ch)
	{
		if((ch >= '0') && (ch <= '9'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class program33_3
{
	public static void main(String A[])
	{
		char cValue = '\0';
		Boolean bRet = false;

		System.out.println("Enter a character:");

		Scanner sobj = new Scanner(System.in);

		cValue = sobj.next().charAt(0);

		Logic lobj = new Logic();
		bRet = lobj.ChkDigit(cValue);

		if(bRet == true)
		{
			System.out.println("It is a digit");
		}
		else
		{
			System.out.println("It is not a digit");
		}
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Testcases successfully handled by the application
//
//    Input1:  5          Output:  It is a digit
//    Input2:  0          Output:  It is a digit
//    Input3:  9          Output:  It is a digit
//    Input4:  A          Output:  It is not a digit
//    Input5:  @          Output:  It is not a digit
//
/////////////////////////////////////////////////////////////////////////////////////////////////

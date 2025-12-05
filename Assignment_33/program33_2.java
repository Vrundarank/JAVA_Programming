////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/ChkCapital
//    Description:          Used to check if given character is a capital or not
//    Input:                Character
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 05/12/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	public Boolean ChkCapital(char ch)
	{
		if((ch >= 'A') && (ch <= 'Z'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class program33_2
{
	public static void main(String A[])
	{
		char cValue = '\0';
		Boolean bRet = false;

		System.out.println("Enter a character:");

		Scanner sobj = new Scanner(System.in);

		cValue = sobj.next().charAt(0);

		Logic lobj = new Logic();
		bRet = lobj.ChkCapital(cValue);

		if(bRet == true)
		{
			System.out.println("It is capital letter");
		}
		else
		{
			System.out.println("It is not capital letter");
		}
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Testcases successfully handled by the application
//
//    Input1:  A          Output:  It is capital letter
//    Input2:  Z          Output:  It is capital letter
//    Input3:  M          Output:  It is capital letter
//    Input4:  a          Output:  It is not capital letter
//    Input5:  9          Output:  It is not capital letter
//
/////////////////////////////////////////////////////////////////////////////////////////////////

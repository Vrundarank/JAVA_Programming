////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/ChkSmall
//    Description:          Used to check if given character is a small case or not
//    Input:                Character
//    Output:               String
//    Author:               vrundarank Shivaji Parite
//    Date:                 05/12/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	public Boolean ChkSmall(char ch)
	{
		if((ch >= 'a') && (ch <= 'z'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class program33_4
{
	public static void main(String A[])
	{
		char cValue = '\0';
		Boolean bRet = false;

		System.out.println("Enter a character:");

		Scanner sobj = new Scanner(System.in);

		cValue = sobj.next().charAt(0);

		Logic lobj = new Logic();
		bRet = lobj.ChkSmall(cValue);

		if(bRet == true)
		{
			System.out.println("It is small case");
		}
		else
		{
			System.out.println("It is not small case");
		}
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Testcases successfully handled by the application
//
//    Input1:  a          Output:  It is small case
//    Input2:  z          Output:  It is small case
//    Input3:  m          Output:  It is small case
//    Input4:  A          Output:  It is not small case
//    Input5:  7          Output:  It is not small case
//
/////////////////////////////////////////////////////////////////////////////////////////////////

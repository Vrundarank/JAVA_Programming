////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/ChkAlpha
//    Description:          Used to check if given character is a alphabet or not
//    Input:                Character
//    Output:               String
//    Author:               Vrundarank Shivaji parite
//    Date:                 05/12/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	public Boolean ChkAlpha(char ch)
	{
		if((ch >= 'a') && (ch <= 'z')
		|| (ch >= 'A') && (ch <= 'Z'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class program33_1
{
	public static void main(String A[])
	{
		char cValue = '\0';
		Boolean bRet = false;

		System.out.println("Enter a character:");

		Scanner sobj = new Scanner(System.in);

		cValue = sobj.next().charAt(0);		
											
		Logic lobj = new Logic();			
											// to check if there is a character at 0th index of that string
		bRet = lobj.ChkAlpha(cValue);

		if(bRet == true)
		{
			System.out.println("It is a character");
		}
		else
		{
			System.out.println("It is not a character");
		}
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Testcases successfully handled by the application
//
//    Input1:  a          Output:  It is a character
//
//    Input2:  Z          Output:  It is a character
//
//    Input3:  5          Output:  It is not a character
//
//    Input4:  @          Output:  It is not a character
//
//    Input5:  m          Output:  It is a character
//
/////////////////////////////////////////////////////////////////////////////////////////////////

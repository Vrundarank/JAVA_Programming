////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/ChkSpecial
//    Description:          Used to check if given character is special symbol or not.
//    Input:                Character
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 05/12/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	public Boolean ChkSpecial(char ch)
	{
		if
		(
			ch == '!' 
		|| 	ch == '@' 
		|| 	ch == '#' 
		|| 	ch == '$' 
		|| 	ch == '%' 
		|| 	ch == '^' 
		|| 	ch == '&' 
		|| 	ch == '*'
		)
		{
			return true;	
		}
		else
		{
			return false;
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program34_4
{
	public static void main(String A[])
	{
		char cValue = '\0';
		boolean bRet = false;

		System.out.println("Enter the character: ");

		Scanner sobj = new Scanner(System.in);

		cValue = sobj.next().charAt(0);

		Logic lobj = new Logic();
		
		bRet = lobj.ChkSpecial(cValue);

		if(bRet == true)
		{
			System.out.println("It is a special character");
		}
		else
		{
			System.out.println("It is not a special character");
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Testcases successfully handled by the application
//
//    Input1:  @         Output:  It is a special character
//
//    Input2:  #         Output:  It is a special character
//
//    Input3:  A         Output:  It is not a special character
//
//    Input4:  5         Output:  It is not a special character
//
//    Input5:  $         Output:  It is a special character
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

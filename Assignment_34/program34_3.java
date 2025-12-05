////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/Display
//    Description:          If character is capital then display from character till Z.
//							Else if character is small case then display in reverse till a.
//							Else display nothing.
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
		if(((ch >= 'A') && (ch <= 'Z')))
		{
			for(char c = ch; c <= 'Z'; c++)
			{
				System.out.printf("%c", c);
			}
		}
		else if(((ch >= 'a') && (ch <= 'z')))
		{
			for(char c = ch; c >= 'a'; c--)
			{
				System.out.printf("%c", c);
			}
		}

		System.out.println();
	}
}

class program34_3
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

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Testcases successfully handled by the application
//
//    Input1:  A         Output:  ABCDEFGHIJKLMNOPQRSTUVWXYZ
//
//    Input2:  M         Output:  MNOPQRSTUVWXYZ
//
//    Input3:  z         Output:  zyxwvutsrqponmlkjihgfedcba
//
//    Input4:  g         Output:  gfedcba
//
//    Input5:  5         Output:  
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

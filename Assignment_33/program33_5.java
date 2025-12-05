////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/DisplaySchedule
//    Description:          Used to display schedule according to division
//    Input:                Character
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 05/12/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	public void DisplaySchedule(char ch)
	{
		if((ch == 'a') || (ch == 'A'))
		{
			System.out.println("Your exam at 7 AM");
		}
		else if((ch == 'b') || (ch == 'B'))
		{
			System.out.println("Your exam at 8:30 AM");
		}
		else if((ch == 'c') || (ch == 'C'))
		{
			System.out.println("Your exam at 9:20 AM");
		}
		else if((ch == 'd') || (ch == 'D'))
		{
			System.out.println("Your exam at 10:30 AM");
		}
	}
}

class program33_5
{
	public static void main(String A[])
	{
		char cValue = '\0';

		System.out.println("Enter your division:");

		Scanner sobj = new Scanner(System.in);

		cValue = sobj.next().charAt(0);

		Logic lobj = new Logic();
		lobj.DisplaySchedule(cValue);
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Testcases successfully handled by the application
//
//    Input1:  A          Output:  Your exam at 7 AM
//    Input2:  b          Output:  Your exam at 8:30 AM
//    Input3:  C          Output:  Your exam at 9:20 AM
//    Input4:  d          Output:  Your exam at 10:30 AM
//    Input5:  Z          Output:  (No output – invalid division)
//
/////////////////////////////////////////////////////////////////////////////////////////////////

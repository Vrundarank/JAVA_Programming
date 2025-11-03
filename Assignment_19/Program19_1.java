////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/checkLeapYear
//    Description:          Used to check whether a given year is leap year or not
//    Input:                Integer
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void checkLeapYear(int iNo)
	{
		if((iNo % 400) == 0)
		{
			System.out.println("Leap year");
		}
		else if((iNo % 100) == 0)
		{
			System.out.println("Not a leap year");
		}
		else if((iNo % 4) == 0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}


class Program19_1
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.checkLeapYear(2024);
	}
}
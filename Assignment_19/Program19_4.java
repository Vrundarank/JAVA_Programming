////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/printDigits
//    Description:          Used to print digits of number separately
//    Input:                Integer
//    Output:               Integer
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void printDigits(int iNo)
	{
		int iDiv = 1;

		// find the largest power of 10
		while(iNo / iDiv >= 10)
		{
			iDiv = iDiv * 10;
		}

		while(iDiv != 0)
		{
			System.out.print(iNo / iDiv + " ");
			iNo = iNo % iDiv;
			iDiv = iDiv / 10;
		}

		System.out.println();
	}
}

class Program19_4
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.printDigits(1234);
	}
}
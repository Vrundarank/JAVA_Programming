////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/checkEvenOdd
//    Description:          Used to whether a number is even or odd
//    Input:                Integer
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void checkEvenOdd(int iNum)
	{
		if(iNum % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}

class Program16_2
{
	public static void main(String A[])
	{
		Logic lObj = new Logic();
		lObj.checkEvenOdd(1);		
	}
}
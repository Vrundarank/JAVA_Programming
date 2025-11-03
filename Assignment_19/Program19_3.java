////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/checkDivisible
//    Description:          Used to check if a given number is divisible by 5 and 11
//    Input:                Integer
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void checkDivisible(int iNo)
	{
		if(iNo % 5 == 0 && iNo % 11 == 0)
		{
			System.out.println("Divisible by 5 and 11");
		}
		else
		{
			System.out.println("Not divisible by 5 and 11");
		}
	}
}

class Program19_3
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.checkDivisible(125);
	}
}
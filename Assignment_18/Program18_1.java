////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/checkPrime
//    Description:          Used to check whether a number is prime or not
//    Input:                Integer
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void checkPrime(int iNo)
	{
		int iCnt = 0;
		int iFrequency = 0;
		int iBound = 0;

		for(iBound = (iNo / 2), iCnt = 2; iCnt <= iBound; iCnt++)
		{
			if(iNo % iCnt == 0)
			{
				iFrequency++;
				break;
			}
		}

		if(iFrequency == 0) // no factors
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}

class Program18_1
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.checkPrime(17);
	}
}
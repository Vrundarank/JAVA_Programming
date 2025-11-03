////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/findFactorial
//    Description:          Used to print factorial of given number
//    Input:                Integer
//    Output:               Integer
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void findFactorial(int iNo)
	{
		int iCnt = 0, iFact = 1;

		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			iFact = iFact * iCnt;
		}

		System.out.println(iFact);
	}
}

class Program16_3
{
	public static void main(String A[])
	{
		Logic lObj = new Logic();
		lObj.findFactorial(5);
	}
}
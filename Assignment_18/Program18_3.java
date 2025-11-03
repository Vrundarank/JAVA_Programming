////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/printOddNumbers
//    Description:          Used to print odd numbers up to N
//    Input:                Integer
//    Output:               Integer
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void printOddNumbers(int iNo)
	{
		int iCnt = 0;

		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			if(iCnt % 2 != 0)
			{
				System.out.printf("%d ", iCnt);
			}
		}

		System.out.println();
	}
}

class Program18_3
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.printOddNumbers(10);	
	}
}
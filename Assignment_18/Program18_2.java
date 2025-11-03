////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/printEvenNumbers
//    Description:          Used to print even numbers up to N
//    Input:                Integer
//    Output:               Integer
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void printEvenNumbers(int iNo)
	{
		int iCnt = 0;

		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			if(iCnt % 2 == 0)
			{
				System.out.printf("%d ", iCnt);
			}
		}

		System.out.println();
	}
}

class Program18_2
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.printEvenNumbers(11);	
	}
}
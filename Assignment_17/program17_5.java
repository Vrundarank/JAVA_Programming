////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/printTable
//    Description:          Used to print multiplication table of a given number
//    Input:                Integer
//    Output:               Integer
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void printTable(int iNo)
	{
		int iCnt = 0;

		for(iCnt = 1; iCnt <= 10; iCnt++)
		{
			System.out.println(iNo * iCnt);
		}
	}
}

class Program17_5
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.printTable(8);
	}
}
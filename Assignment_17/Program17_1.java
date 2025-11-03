////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/sumOfDigits
//    Description:          Used to display sum of digits of a number
//    Input:                Integer
//    Output:               Integer
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void sumOfDigits(int iNo)
	{
		int iDigit = 0, iSum = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		while(iNo != 0)
		{
			iDigit = iNo % 10;
			iSum = iSum + iDigit;
			iNo = iNo / 10;
		}

		System.out.println(iSum);
	}
}

class Program17_1
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.sumOfDigits(1234);
	}
}
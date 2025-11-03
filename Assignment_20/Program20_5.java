////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/findSmallestDigit
//    Description:          Used to find the smallest digit in a number
//    Input:                Integer
//    Output:               Integer
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void findSmallestDigit(int iNo)
	{
		int iDigit = 0, iCurrent = 0;

		iCurrent = iNo % 10;

		while(iNo != 0)
		{
			iDigit = iNo % 10;
			if(iDigit < iCurrent)
			{
				iCurrent = iDigit;
			}
			iNo = iNo / 10;
		}

		System.out.println(iCurrent);
	}
}

class Program20_5
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.findSmallestDigit(45172);
	}
}
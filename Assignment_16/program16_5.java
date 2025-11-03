////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/countDigits
//    Description:          Used to count digits of given number 
//    Input:                Integer
//    Output:               Integer
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void countDigits(int iNo)
	{
		int iDigit = 0, iFrequency = 0;

		while(iNo != 0)
		{
			iDigit = iNo % 10;
			iFrequency++;
			iNo = iNo / 10;
		}

		System.out.println(iFrequency);
	}
}

class Program16_5
{
	public static void main(String A[])
	{
		Logic lObj = new Logic();
		lObj.countDigits(12456);
	}
}
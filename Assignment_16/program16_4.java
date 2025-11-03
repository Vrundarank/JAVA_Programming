////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/reverseNumber
//    Description:          Used to reverse digits of given number
//    Input:                Integer
//    Output:               Integer
//    Author:               Vrundarank Shivaji Parite
//    Date:                 28/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void reverseNumber(int iNo)
	{
		int iDigit = 0;

		while(iNo != 0)
		{
			iDigit = iNo % 10;
			System.out.println(iDigit);
			iNo = iNo / 10;
		}
	}
}

class Program16_4
{
	public static void main(String A[])
	{
		Logic lObj = new Logic();
		lObj.reverseNumber(1234);
	}
}
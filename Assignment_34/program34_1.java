////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
//    Class/Method Name:    Logic/DisplayASCII
//    Description:          Used to display ASCII table
//    Input:                Character
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 05/12/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	public void DisplayASCII()
	{
		int iCnt = 0;

		System.out.printf("ASCII table\n");
		System.out.printf("Symbol\tDec\tHex\tOct\n");
		for(iCnt = 0; iCnt <= 255; iCnt++)
		{
			System.out.printf("%c\t%d\t%x\t%o\n", iCnt, iCnt, iCnt, iCnt);
		}
	}
}

class program34_1
{
	public static void main(String A[])
	{
		Logic lobj = new Logic();
		lobj.DisplayASCII();
	}
}
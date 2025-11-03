////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/findMax
//    Description:          Used to compare two numbers and find the max of them
//    Input:                Integer, Integer
//    Output:               String
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void findMax(int iNo1, int iNo2)
	{
		if(iNo1 > iNo2)
		{
			System.out.println("Number one is greater than number two.");
		}
		else
		{
			System.out.println("Number two is greater than number one.");
		}
	}
}

class Program17_3
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.findMax(2, 15);
	}
}
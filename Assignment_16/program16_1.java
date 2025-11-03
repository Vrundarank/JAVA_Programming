////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/calculateSum
//    Description:          Used to calculate sum of first N natural number
//    Input:                Integer
//    Output:               Integer
//    Author:               Vrundarank Shivaji Parite
//    Date:                 03/11/2025 
//
////////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic 
{
    void calculateSum(int n)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
		{
			iSum = iSum + iCnt;
		}

		System.out.println(iSum);
        
    }
}

class Program16_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}
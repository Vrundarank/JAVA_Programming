class Logic
{
	void productOfDigits(int iNo)
	{
		int iDigit = 0, iMult = 1;

		// Did'nt whether to include/exclude 0 
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			iMult = iMult * iDigit;
			iNo = iNo / 10;
		}

		System.out.println(iMult);
	}
}

class Program21_1
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.productOfDigits(234);
	}
}
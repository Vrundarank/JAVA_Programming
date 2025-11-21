// Accept N numbers from user and return frequency of even numbers.

import java.util.*;


class Program22_1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter how many elements you want : ");
        Scanner scount = new Scanner(System.in);
        int n = 0;
        int iInput = 0;
        
        System.out.println("Enter The Elements : ");
        n = sobj.nextInt();
        int CountEven = 0;
        int i = 0;


        iInput = scount.nextInt();

        System.out.println("Enter Numbers : " + n );

        for(i = 0; i < n ; i++)
        {
            if((i % 2) == 0)
            {
                CountEven = CountEven + 1;
            }
        }
        
        System.out.println("Frequency of Occurrence Elements is : " + CountEven);
    }
}
package TestCase;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meshack
 */
public class HexadecimalConversion
{

    int num, rem, myArray[] = new int[10];

    // For storing result
    String convertedNummber = "";

    // Digits in hexadecimal number system
    char hex[] =
    {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public HexadecimalConversion()
    {
        this(0);
    }

    public HexadecimalConversion(int num)
    {
        this.num = num;
    }

    public int getNum()
    {
        return num;

    }

    public void setNum(int num)
    {
        if (num > 0 && num <= 10000)
        {
            this.num = num;
        }
        else
        {
            throw new IllegalArgumentException("Number should be in range of 0 to 10000");
        }
    }

    public int change()
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        num = input.nextInt();

        //check if value is in range
        while (num < 0 || num > 10000)
        {
            System.out.println("Number should be in range of 0 to 10000 \n");
            System.out.print("Enter a decimal number : ");

            num = input.nextInt();
        }

        //check if value is correct
        while (num > 0)
        {

            rem = num % 16;
            convertedNummber = hex[rem] + convertedNummber;
            num /= 16;
        }
        System.out.println("Decimal to hexadecimal: " + convertedNummber + "\n");

        return num;

    }

    public void addSecondToTenth()
    {

        System.out.print("Enter 10 digits into the system for calculations \n");

        int sumOfSecondToTenth = 0; // initialize sum

        //add values to the array
        for (int i = 0; i < 10; i++)
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Value number: " + i + ": \n");
            num = input.nextInt();

            //add values to the array
            myArray[i] = num;

        }
        //display array
        System.out.println("Array values: " + Arrays.toString((myArray)));

        // add values from 2nd to last
        for (int i = 1; i < myArray.length; i++)
        {

            //add all values from 2nd to 10th
            sumOfSecondToTenth += myArray[i];
        }
        //display results
        System.out.println("Sum of values from 2nd tothe 10th: " + sumOfSecondToTenth);

    }

    //add values from 10th to 2nd
    public void addTenthToSecond()
    {
        int sumOfTenthToSecond = 0; // initialize sum

        // add values from last to 2nd
        for (int i = myArray.length - 1; i >= 1; i--)
        {
            //add all values from  10th to 2nd

            sumOfTenthToSecond += myArray[i];
        }
        System.out.println("Sum of values from 10th to the 2nd: " + sumOfTenthToSecond);

    }

}

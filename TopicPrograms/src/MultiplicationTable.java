/**
 * Created by Timileyin on 29/09/2015.
 **/
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String args[])
    {
        int start, end, i, val;
        Scanner mScanner = new Scanner(System.in);
        System.out.println("Enter range of numbers to print multiplication table:");
        start = mScanner.nextInt();
        end = mScanner.nextInt();

        for(i=start; i<=end; i++)
        {
            for(val=1; val<=10; val++)
            {
                System.out.print(i * val + "\t");
            }
            System.out.println();
        }
    }

}


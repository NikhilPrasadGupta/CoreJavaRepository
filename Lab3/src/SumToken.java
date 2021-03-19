/*Name : Nikhil Prasad Gupta
 * Description:  Write a Java program that reads a line of integers and then displays each integer and the
s                um of all integers. (Use String Tokenizer class)? .
 * Date: 19/03/2021
 */


import java.util.*;

public class SumToken {
	public static void main(String args[])
    {
                  String series="1 2 3 4 5 6 7 8 9 10";
                StringTokenizer token=new StringTokenizer(series);
                int dig=0,sum=0;
                System.out.println("\nEntered digits are : ");
                while(token.hasMoreTokens())
                {
                            String s=token.nextToken();
                            dig=Integer.parseInt(s);
                            System.out.print(dig+" ");
                            sum=sum+dig;
                }
                System.out.println();
                System.out.println("Sum is : "+sum);
    }
}

/*Name : Nikhil Prasad Gupta
 * Description: Program for sum of cube of number..
 * Date: 19/03/2021
 */


import java.util.Scanner;

public class SumOfCube {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number=scanner.nextInt();
	int result=cubeSum(number);
	System.out.println("Sum of cubes of the digits: "+result);
}
public static int cubeSum(int num) {
	int sum=0;
while(num>0) {
	int num1=num%10;
	sum=num1*num1*num1+sum;
	num=num/10;
	
}
return sum;
}
}

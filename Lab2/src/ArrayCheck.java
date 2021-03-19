/*Name : Nikhil Prasad Gupta
 * Description: Write a program to Take 20 integer inputs from user and print the following:
				1. number of positive numbers
				2. number of negative numbers
				3. number of odd numbers
				4. number of even numbers
				5. number of 0s.
 * Date: 19/03/2021
 */




import java.util.*;
public class ArrayCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {-5,8,6,97,65,74,98,64,84,33,0,89,95,90,76,77,55,73,98,-26};
		int cPositive=0,cNegative=0,cEven=0,cOdd=0,cZero=0;
		
		
		for(int i=0;i<20;i++) {
		if(arr[i]>0)
			cPositive++;
		if(arr[i]<0)
		cNegative++;
		if(arr[i]%2==0)
			cEven++;
		if(arr[i]%2!=0)
			cOdd++;
		if(arr[i]==0)
			cZero++;
	}
		System.out.println("Total Positive numbers: "+cPositive);
		System.out.println("Total Negative numbers: "+cNegative);
		System.out.println("Total Even numbers: "+cEven);
		System.out.println("Total Odd numbers: "+cOdd);
		System.out.println("Total Zeros : "+cZero);
	}
}

/*Name : Nikhil Prasad Gupta
 * Description: Write a program to check whether an array contains an specific value or not...
 * Date: 19/03/2021
 */





import java.util.Scanner;

public class ArraySpecificValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//boolean status=true;
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in array ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the element to check specific value in array");
		int number=sc.nextInt();
		if(check(arr,number)) {
			System.out.println(number+" is present");
		}
		else 
			System.out.println(number+" is not present");
		
	}	
		//int num=sc.nextInt();
		
	
	public static boolean check(int arr[],int num) {
		boolean status=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				status=true;
			}
			
	}
		return status;
	}
	}

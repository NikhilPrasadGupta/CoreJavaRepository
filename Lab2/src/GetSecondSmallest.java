
/*Name : Nikhil Prasad Gupta
 * Description: Write a program to get second largest number in array.
 * Date: 19/03/2021
 */


import java.util.Arrays;

public class GetSecondSmallest {
	public static void main(String[] args) {
		int arr[]= {5,8,66,86};
		int result=getSecondSmallest(arr);
		System.out.println(result);
		
		
	}
	
	public static int getSecondSmallest(int []arr) {
		Arrays.sort(arr);
		int num=arr[arr.length-2];
		return num;
	}
}
						
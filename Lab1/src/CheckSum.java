/*Name : Nikhil Prasad Gupta
 * Description: Calculate the sum of first n natural numbers which are divisible by 3 or 5.
 * Date: 19/03/2021
 */
public class CheckSum {
	 public static void main(String[] args) {
		int result=calculateSum(2);
		System.out.println("Sum of first n natural number which is divisible by 3 or 5= "+result);
	}

	public static int calculateSum(int num) {
		int sum=0;
		for(int i=num;;++i) {
			sum=sum+i;
			if(sum%3==0 || sum%5==0)
				return sum;
			
		}
		
		
	
	}
}

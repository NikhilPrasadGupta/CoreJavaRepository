/*Name : Nikhil Prasad Gupta
 * Description: Create a class with a method to find the difference between 
 * 			the sum of the squares and the square of the sum of the first n natural numbers.
 * Date: 19/03/2021
 */
public class CalculateDifference {
		public static void main(String[] args) {
			
			int diff=calculateDifference(2);
			System.out.println(diff);
			}
		
		public static int squareSum(int n) 
	    { 
	        int sum = 0; 
	        for (int i = 1; i <= n; i++) 
	            sum += (i * i); 
	        return sum; 
	    }
		public static int calculateDifference(int num) {
			int n=squareSum(num)- sumSquare(num); 
			return n;
		}
		public static int sumSquare(int n) {
			int sum=0,a;
			 for (int i = 1; i <= n; i++) 
		            sum += (i); 
		       
			return sum*sum;
		
			
			
			
}
		}

/*Name : Nikhil Prasad Gupta
 * Description: Create a method to check if a number is a power of 2 or not.
 * Date: 19/03/2021
 */

public class CheckPowerOfTwo {
		public static void main(String[] args) {
			
			boolean flag=checkPowerofTwo(32);
			if(flag)
				System.out.println("Power of 2");
			else
				System.out.println("Not a Power of 2");
		}
	public	static boolean checkPowerofTwo(int x)
		{
		   
		   if (x == 0)
		      return false;

		   
		   while( x != 1)
		   {
		   
		      if(x % 2 != 0)
		         return false;
		         x /= 2;
		   }
		   return true;


}
}
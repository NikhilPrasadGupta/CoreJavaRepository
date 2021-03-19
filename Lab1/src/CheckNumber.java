/*Name : Nikhil Prasad Gupta
 * Description: Create a method to check if a number is a increasing number or not.
 * Date: 19/03/2021
 */
public class CheckNumber {
	public static void main(String[] args) {
		boolean flag;
		flag=isIncreasing(123456);
		if(flag)
			System.out.println("increasing number");
		else 
			System.out.println("Not increasing number");
	}
public static boolean isIncreasing(int number) 
	{
		String s = Integer.toString(number);
		char ch;
		int f = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			ch = s.charAt(i);
			if (ch > s.charAt(i + 1))
			{
				f = 1;
				break;
			}
		}
		if (f == 1)
			return false;
		else
			return true;
	}

	

}

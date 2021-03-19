/*Name : Nikhil Prasad Gupta
 * Description: Create a method that accepts a String and checks if it is a positive string. A string is
				considered a positive string, if on moving from left to right each character in the String comes after the
				previous characters in the Alphabetical order. For Example: ANT is a positive String (Since T comes after
				N and N comes after A). The method should return true if the entered string is positive
 * Date: 19/03/2021
 */

public class StringCheck {
	public static void main(String[] args) {
		String str="ANT";
		boolean flag=stringCheck(str);
		if(flag)
			System.out.println("String is positive");
		else
			System.out.println("String is not positive");
	}
	public static boolean stringCheck(String str) {
		boolean flag=false;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i+1)>str.charAt(i)) {
				flag=true;
			}
			else
				flag=false;
	}
		
			return flag;
			
		

}
}

/*Name : Nikhil Prasad Gupta
 * Description: Accept a number and modify it such that the each of the digit in the newly
				formed number is equal to the difference between two consecutive digits in the
				original number.
				For example.
				Input: 45862
				Output:13242
 * Date: 19/03/2021
 */

public class ModifyNumber {
		public static void main(String[] args) {
			int result=modifyNumber(45862);
			System.out.println(result);
		}
		public static int modifyNumber(int num) {
			
			int result;
			String str=""+Integer.toString(num);
			StringBuffer finalResult=new StringBuffer("");
			int diff;
			for(int i=0;i<str.length()-1;i++) {
				diff=str.charAt(i+1)-str.charAt(i);
				finalResult.append(Math.abs(diff));
			}
			finalResult.append(str.charAt(str.length()-1));
			String str1=finalResult.toString();
			 result=Integer.parseInt(str1);
			return result;
		}
}

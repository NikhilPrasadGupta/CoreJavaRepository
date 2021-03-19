/*Name : Nikhil Prasad Gupta
 * Description :Create a method that can accept an array of String objects and sort in alphabetical order.
T              he elements in the left half should be completely in uppercase and the elements in the right half should
               be completely in lower case. Return the resulting array.
               Note: If there are odd number of String objects, then (n/2) +1 elements should be in
               UPPPERCASE .

 * Date: 19/03/2021
 */


public class SortStrings {
//	private static String string;
	public static void main(String[] args) {
		String[] arr= {"Rahul","Rohit","Shivam"};
		String[] arr1= {"Rahul","Rohit","Shivam","Aman"};
		String str=sortString(arr);
		System.out.println(str);
		String str1=sortString(arr1);
		System.out.println(str1);

	}
	public static String sortString(String [] str) {
		
		String  finalString="";
		
		//String []arr=new String[str.length];
		if(str.length%2==0) {
			String str1="";String str2="";
			int length=str.length/2;
			for(int i=0;i<length;i++) {
				str1=str1+str[i];
					}
			str1=str1.toUpperCase();
			
			for(int i=length;i<str.length;i++) {
				str2=str2+str[i];
			}
			str2=str2.toLowerCase();
			
			finalString=str1+str2;
			return finalString;
		}
		else {
			String str1="";String str2="";
			int length=(str.length/2)+1;
			for(int i=0;i<length;i++) {
				str1=str1+str[i];
			}
			str1=str1.toUpperCase();
			
			for(int i=length;i<str.length;i++) {
				str2=str2+str[i];
				
			}
			str2=str2.toLowerCase();
			
			finalString=str1+str2;
			return finalString;
			}
		
		//return finalString;
	
	}
	
}

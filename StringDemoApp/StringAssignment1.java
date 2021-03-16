
/* Name: Nikhil Prasad Gupta
 * Description: /*Challenge :  Write your logic here so that the output should be in reverse order. It should be displayed as
		  Friends Dear My Hello.
		  You need to reverse the String word by word. 
		  Limitation :  Do not use the reverse method
 		  Date: 15/3/2021 
*/



public class StringAssignment1 {

	public static void main(String[] args) {
		String str = "Hello My Dear";
		String finalString="";
		String  array[]=str.split(" ");
		for(int i=array.length-1;i>=0;i--) {
			finalString= finalString+ " " + array[i];
			}
		System.out.println(finalString);
		
		

	}

}
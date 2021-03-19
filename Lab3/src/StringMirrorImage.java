/*Name: Nikhil Prasad Gupta
 * Description : This program will show the mirror of string 
 */
public class StringMirrorImage {
	public static void main(String[] args) {
		String str="EARTH";
		String mirrorString=getImage(str);
		System.out.println(mirrorString);
	}
public static String getImage(String str) {
	StringBuffer str1=new StringBuffer(str);
	String str2=str1.reverse().toString();
	String finalString=str+"|"+str2;
	return finalString;

}
}

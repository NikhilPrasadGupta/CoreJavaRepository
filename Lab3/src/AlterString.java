/*Name : Nikhil Prasad Gupta
 * Description: Return the String replacing all the consonants with the next character.
					For Example :JAVA should be changed as KAWA.
 * Date: 19/03/2021
 */




public class AlterString {
	public static void main(String[] args) {
		String str="JAVA";
		String mirrorString=alterString(str);
		System.out.println(mirrorString);
	
	}
	
	public static String alterString(String str) {
		String finalString="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		if(ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') {
			
			}
			else
				ch++;
			finalString=finalString+ch;
		
		}
			
			
			return finalString;

	}
}

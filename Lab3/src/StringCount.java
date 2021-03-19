
/*Name : Nikhil Prasad Gupta
 * Description: Write a program to count lines characters,words in a atring.
 * Date: 19/03/2021
 */




import java.util.*;
public class StringCount {
	public static void main(String[] args) {
		String line="My name is Nikhil.IMy hobbies is play chess.";
		int lines=0,character=0,words=0,space=0;
		for(int i = 0; i < line.length(); ++i)
		{
		char ch = line.charAt(i);
		if(ch==' ')
			space++;
		if(ch=='.')
			lines++;	
	}
		System.out.println("Characters are: "+(line.length()-space));
		System.out.println("Words  are: "+(space+1));
		System.out.println("Lines are: "+lines);
	}
}
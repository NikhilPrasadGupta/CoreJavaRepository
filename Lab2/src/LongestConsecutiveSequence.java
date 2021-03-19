/*Name : Nikhil Prasad Gupta
 * Description: Write a program to check for longest consecutive sequence.
 * Date: 19/03/2021
 */




import java.util.Arrays;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		
		int[] array= {49,1,3,200,2,4,70,5};
		
		Arrays.sort(array);
		int i,j,length=1;
		for(i=0;i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[j]==array[i]+1) {
					length+=1;
				}else {
					break;
				}
			}
		}
		
		System.out.println("The length of the longest consecutive sequence is " +length);
		

	}

}
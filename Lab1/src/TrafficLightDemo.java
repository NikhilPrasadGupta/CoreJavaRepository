/*Name : Nikhil Prasad Gupta
 * Description: Program for traffic light demo.
 * Date: 19/03/2021
 */



import java.util.*;
public class TrafficLightDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		System.out.println("1. Red");
		System.out.println("2. Green");
		System.out.println("3. Yellow");
		System.out.println("Select the Light: ");
		num=scanner.nextInt();
		if(num==1)
			System.out.println("Stop");
		else if(num==2)
			System.out.println("Go");
		else if(num==3)
			System.out.println("Ready");
	}

}

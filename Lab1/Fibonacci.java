/* Name: Nikhil Prasad Gupta
 * Description: Fibonacci series upto nth number
 * Date: 13/03/2021
 */




import java.util.*;

public class Fibonacci {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int num=scanner.nextInt();
	StringBuilder result=generateFibonacci(num);
	System.out.println(result);
}
public static StringBuilder generateFibonacci(int num) {
	StringBuilder result=new StringBuilder();
	int n1=0,n2=1,n3,i;
	System.out.print(n1+" "+n2);
	for(i=2;i<num;i++){
		n3=n1+n2;
		result.append(" " +n3);
		n1=n2;
		n2=n3;
	}
return result;	

}
}

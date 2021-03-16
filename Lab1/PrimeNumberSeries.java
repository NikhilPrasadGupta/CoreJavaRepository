/* Name: Nikhil Prasad Gupta
 * Description: Prime number series upto nth number
 * Date: 13/03/2021
 */






import java.util.Scanner;  

public class PrimeNumberSeries {
 
	   public static void main(String[] args) {  
	       Scanner s = new Scanner(System.in);  
	       System.out.print("Enter the number : ");  
	       int num = s.nextInt();  
	       System.out.println("List of prime numbers between upto "+num );  
	       for (int i = 1; i <= num; i++) {  
	           if (isPrime(i)) {  
	               System.out.println(i);  
	           }  
	       }  
	   }  
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= n/2; i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	}  

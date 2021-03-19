
/*Name : Nikhil Prasad Gupta
 * Description: Write a program to check whether array contains duplicate values or not..
 * Date: 19/03/2021
 */



public class DuplicateValues {
	public static void main(String[] args) {
		String [] arr= {"Telivision","Watch","Laptop","Desktop","Keyboard" ,"Laptop"};
		int i,j,flag=0;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					flag=1;
					break;
				}
			}
			
			if(flag==1) {
				System.out.println(arr[i]+" is a duplicate value");
			}
			flag=0;
			
		}

	}
}

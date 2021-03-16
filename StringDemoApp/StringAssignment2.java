/*   Name: 		   Nikhil Prasad Gupta
 *   Description:  Challenge: You need to return commands from url.Url can be anything
 *				   Examples: index, service, showProducts are the neme of commands.
 *   Date:         15/03/2021
 */




public class StringAssignment2 {
public static void main(String[] args) {
	String url1="https://www.cognizant.com/admin/policy/index.html";
	String url2="https://www.cognizant.com/service.jsp";
	String url3="https://www.cognizant.com/customer/product/local/showProducts.asp";
	String command1=getCommand(url1);
	String command2=getCommand(url2);
	String command3=getCommand(url3);
	System.out.println("Command 1: "+command1);
	System.out.println("Command 2: "+command2);
	System.out.println("Command 3: "+command3);

}

private static String  getCommand(String url) {
	String  array[]=url.split("/");
	String str=array[array.length-1];
	String array1[]=str.split("\\.");
	String finalResult=array1[array1.length-2];
	return finalResult;
}
}

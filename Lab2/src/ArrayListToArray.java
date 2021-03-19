/*Name : Nikhil Prasad Gupta
 * Description: Write a program to convert array list to array..
 * Date: 19/03/2021
 */


import java.io.*; 
import java.util.List; 
import java.util.ArrayList; 
public class ArrayListToArray {
 
    public static void main(String[] args) 
    { 
        List<Integer> al = new ArrayList<Integer>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40); 
  
        Object[] objects = al.toArray(); 
  
        // Printing array of objects 
        for (int i=0;i<objects.length;i++) 
            System.out.print(objects[i] + " "); 
    } 
}
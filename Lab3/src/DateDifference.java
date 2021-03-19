/*Name : Nikhil Prasad Gupta
 * Description: Write a program to find difference between dates.
 * Date: 19/03/2021
 */


import java.text.ParseException; 
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date; 
  
class DateDifference { 
  
    static void
    findDifference(String start_date, 
                   String end_date) 
    { 
  
        SimpleDateFormat sdf 
            = new SimpleDateFormat( 
                "dd-MM-yyyy HH:mm:ss"); 
  
        try { 
  
            Date d1 = sdf.parse(start_date); 
            Date d2 = sdf.parse(end_date); 
  
            long difference_In_Time 
                = d2.getTime() - d1.getTime(); 
  
            long difference_In_Seconds 
                = (difference_In_Time 
                   / 1000) 
                  % 60; 
  
            long difference_In_Minutes 
                = (difference_In_Time 
                   / (1000 * 60)) 
                  % 60; 
  
            long difference_In_Hours 
                = (difference_In_Time 
                   / (1000 * 60 * 60)) 
                  % 24; 
  
            long difference_In_Years 
                = Math.abs((difference_In_Time 
                   / (1000l * 60 * 60 * 24 * 365))); 
  
            long difference_In_Days 
                = (difference_In_Time 
                   / (1000 * 60 * 60 * 24)) 
                  % 365; 
  
            System.out.print( 
                "Difference "
                + "between two dates is: "); 
            long month=Math.abs((difference_In_Days)/30);
            long day=Math.abs((difference_In_Days)%30);
            System.out.println( 
                difference_In_Years 
                + " years, "+month +" months "
                + day 
                + " days, "); 
        } 
  
    
        catch (ParseException e) { 
            e.printStackTrace(); 
        } 
    } 
  
    
    public static void main(String[] args) 
    {  
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  				
    System.out.println();
        
        String start_date 
            = dtf.format(now); 
  
        
        String end_date 
            = "29-05-2019 06:30:50"; 
  
           findDifference(start_date, end_date); 
    } 
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////         Instructions           /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

Given a long integer representing a 10-digit phone number, output the area code, prefix, and line number using the format (800) 555-1212.
For example, if the input is: "8005551212" then the output is "(800) 555-1212".

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////            Program             /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class reformatPhoneNumber {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
      long firstPortion; 
      long secondPortion;
      long thirdPortion; 
      
      phoneNumber = scnr.nextLong();
      firstPortion = phoneNumber/10000000;
      secondPortion = (phoneNumber%10000000)/10000;
      thirdPortion = phoneNumber%10000;
      
      System.out.println("(" + firstPortion + ") " + secondPortion + "-" + thirdPortion);      
   }
}

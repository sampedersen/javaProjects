///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////         Instructions           /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

Design a program that takes in an integer as input and outputs the factorial of that integer. If the integer is less than 0, output the word "Error". 
For example, if the input is: "4" then the output is: "24"

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////            Program             /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class factorialCalculations {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num = scnr.nextInt();
      int i; 
      
      if (num <= 0) {                               // If the number is less than or equal to 0...
         System.out.print("Error");                 //    ... print error (cannot take factorial).
      }
      else {                                        // Otherwise,
         for (i = num-1; i > 0; --i) {              //    ... For i (initialized as num-1), as long as i is greater than 0 and decrements each iteration.....
            num = i*num;                            //    ... update num to be i*num
         }
         System.out.print(num);                     // Print the number 
      }   
   }
}
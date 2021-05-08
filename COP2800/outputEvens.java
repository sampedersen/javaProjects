///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////         Instructions           /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

(1) Given positive integer n, write a for loop that outputs the even numbers from n down to 0. 
    If n is odd, start with the next lower even number. 
    For example: 
    
    Enter an integer:                             // Console prompt
    7                                             // User input 
    Sequence: 6 4 2 0                             // Output
    
(2) If n is negative, output 0
    For example: 
    
    Enter an integer:                             // Console prompt
    -1                                            // User input 
    Sequence: 0                                   // Output

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////            Program             /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

public class outputEvens {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputValue;
   
      System.out.println("Enter an integer:");
      inputValue = scnr.nextInt();
   
      System.out.print("Sequence: ");
      
      if (inputValue > 0) {                                           // Specifies positive, nonzero values 
         if (inputValue % 2 == 0) {                                   // If even...
            for (int i = inputValue; i >= 0; i = i - 2) {             //    ... Decrement by 2 and print each number 
               System.out.print(i + " ");
            }
         }
         else {                                                       // Otherwise (if odd)...
            inputValue = inputValue - 1;                              //    ... decrease to nearest even number...
            for (i = inputValue; i >= 0; i = i - 2) {                 //    ... Decrement by 2 and print each number 
               System.out.print(i + " ");
            }
         }
      }
      else {                                                            // Satisfies (2)
         inputValue = 0;
         System.out.print(inputValue + " ");
      }
      System.out.println();
   }
}

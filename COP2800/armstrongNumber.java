///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////         Instructions           /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

Write a program to print out all "Simplified Armstrong Number" in the range [a, b]. 
If sum of cubes of each digit of the number is equal to the number itself, then the number is called "Simplified Armstrong Number".
      For example, 153 is a simplified armstrong number. 
      1*1*1 + 5 * 5 *5 + 3 * 3 *3 = 153. 
Users enter the value for a and b, where a and b are greater than zero and a <= b

For example, if the input is: "0 200" (0 = lower boundary; 200 = upper boundary) then the output is:

"0                        // 0*0*0 = 0 (true)
1                         // 1*1*1 = 1 (true)
153"                      // 1*1*1 + 5 * 5 *5 + 3 * 3 *3 = 153 (true)

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////            Program             /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

public class armstrongNumber {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int lowerLimit = scnr.nextInt();
      int upperLimit = scnr.nextInt();
      int i;
      
      for (i = lowerLimit; i <= upperLimit; ++i) {
         int digit = i;
         int sum = 0;
         while (digit != 0) {
            int remainder = digit % 10;
            sum = sum + (remainder * remainder * remainder);
            digit = digit/10;
         }
         
         if (sum == i || i == 0) {
            System.out.println(i);
         }
      }      
   }
}

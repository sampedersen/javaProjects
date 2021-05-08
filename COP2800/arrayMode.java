///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////         Instructions           /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

Given 10 integers ranging from 0 to 99, output the mode and its frequency. 
    For example, if the input is: "1 1 1 1 2 2 9 8 7 6", then the output is: "1 4"
If any integer is outside 0-99, output an error. 
    For example, if an input includes: "105", the output is: "Invalid input: 105 is not in 0-99"

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////            Program             /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class arrayMode {
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] tallyCounter = new int[100];
        int[] userValues = new int[10];
        
        // Fill the arrays
        for (int i = 0; i < 10; ++i) {
            userValues[i] = scnr.nextInt();
        }
        for(i=0; i<100; i++) {
            tallyCounter[i] = 0;
        }

        // make sure all the numbers are in range + tally appearances 
        for(i=0; i<10; i++) {
            if(userValues[i] > 99 || userValues[i] < 0){
                System.out.println("Invalid input: " + userValues[i] + " is not in 0-99");
            }
            tallyCounter[userValues[i]] = tallyCounter[userValues[i]] + 1;  // Increment the number's index position in tallyCount +1 to track how many times it appears 
        }
     
        // Initialize values      
        int highestFrequency = tallyCounter[userValues[0]];               // Example: tallyCounter[userValues[0]] == tallyCounter[56] == 0 
        int mode = userValues[0];

        // Start comparisons to find the mode 
        for(i=0; i<100; i++) {
            if(tallyCounter[i] > highestFrequency){
                highestFrequency = tallyCounter[i];
                mode = i;
            }
        }

        System.out.println(mode + " " + highestFrequency);
    }
}

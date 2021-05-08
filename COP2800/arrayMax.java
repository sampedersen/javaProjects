///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////         Instructions           /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

Traversing an array to find the max (or min) is common. Given an array of integers, output the maximum integer found in the array. 
For example, if the input is: "4 3 8 2 6" then the output is: "8".

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////            Program             /////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class arrayMax {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numItems;
      int currItem;
      int i;
      int maxItem;
      
      // Get items and make the array
      numItems = scnr.nextInt();
      int[] listItems = new int[numItems];
      for (i = 0; i < numItems; ++i) {
         currItem = scnr.nextInt();
         listItems[i] = currItem;
      }
      
      maxItem = listItems[0];
      for (i = 0; i < listItems.length; ++i) {
         if (listItems[i] > maxItem) {
            maxItem = listItems[i];
         }
      }
      
      System.out.println(maxItem);
      
      
   }
}
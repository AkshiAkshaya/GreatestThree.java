//Program to find the greatest among three numbers.

import java.util.Scanner;

public class GreatestThree
{
   public static void main(String args[])
   {
      Scanner reader = new Scanner(System.in);
      System.out.print("\nEnter the numbers ----");
      System.out.print("\nEnter the first number = ");
      int fn = reader.nextInt();
      System.out.print("\nEnter the second number = ");
      int sn = reader.nextInt();
      System.out.print("\nEnter the third number = ");
      int tn = reader.nextInt();

      reader.close();
     
      // Code to find the greatest
      if(fn>sn)
      {
         if(fn>tn)
         {
            System.out.print("\nThe Greatest no = " + fn);
         }
         else
         {
            System.out.print("\nThe Greatest no = " + tn);
         }
      }
      else
      {
         if(sn>tn)
         {
            System.out.print("\nThe Greatest no. = " + sn);
         }
         else
         {
            System.out.print("\nThe Greatest no. = " + tn);
         }
      }
   }
}


import java.util.Scanner;

public class TwoNumbers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      // Keep prompting the user until the input is correct
      int preventRepeat = 0;
      
      System.out.println("Enter two positive integers, the first smaller than the second.");
      System.out.print("First: ");
      int a = in.nextInt();
      System.out.print("Second: ");
      int b = in.nextInt();
      
      while ( a > b )
      {
          System.out.println("Enter two positive integers, the first smaller than the second.");
          System.out.print("First: ");
          a = in.nextInt();
          System.out.print("Second: ");
          b = in.nextInt();
          
          if ( a < b)
          {
              System.out.println("You entered " + a + " and " + b);
              preventRepeat++;
            }
          
        }
     
     // Only print this when the input is correct
     if (preventRepeat > 0)
      System.out.println("You entered " + a + " and " + b);
      
   }
}
import java.util.Scanner;

public class FacePrint {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char userChar = '-iimii-'; // User-entered character
      String usrInput = "";

      while (userChar != 'q') {
         // Print face
         System.out.println("" + userChar + " " + userChar);
         System.out.println(" " + userChar);
         System.out.println("" + userChar + "" + userChar + "" + userChar);
	 System.out.println("test");
         // Get user character
         System.out.print("\nEnter a character ('q' to quit): ");
         usrInput = scnr.next();
         userChar = usrInput.charAt(0); // Get the first char in the String
         System.out.println("");
      }

      System.out.println("Goodbye.");

      return;
   }
}

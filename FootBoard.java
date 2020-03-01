import java.util.Scanner;

/****************************************************************************
 * Created by: Callan Farrell.
 * Created on: Feb 2020
 * Created for: ICS4U
 * This program tells the user the height of a foot board, given its length
 * and width
 ****************************************************************************/

public class FootBoard {

  /****************************************
  * This program tells the user the height of a foot board, given its length.
  * and width
  *****************************************/
 
  public static void main(String[] arg) {
    Scanner userInput = new Scanner(System.in);
    double length;
    double width;
    int counter;
  
    length = 0.0;
    width = 0.0;
    counter = 0;

    // Makes sure length and width cannot be negative
    while (length <= 0.0 || width <= 0) {

      if (counter != 0) {

        System.out.print("Invalid input!, Please input positive dimensions! ");
      }

      System.out.print("Enter the length of the foot board (inches): ");
      length = userInput.nextDouble();

      System.out.print("Enter the width of the foot board (inches): ");
      width = userInput.nextDouble();
      counter += 1;
    }
    
    double height;
    height = footboard(length, width);
    
    System.out.print("\n The height of the board is " + height + " inches.");
  }

  /****************************************************
  * Created by: Callan Farrell.
  *****************************************************/
 
  public static double footboard(double len, double wid) {
        
    double height;
    double volume;

    // Calculates height
    volume = 144.0;
    height = (volume / len) / wid;

    return height;
  }
}

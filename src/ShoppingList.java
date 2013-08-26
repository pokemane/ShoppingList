/**
 * Created with IntelliJ IDEA.
 * User: JackAttack
 * Date: 8/19/13
 * Time: 6:55 PM
 * To change this template use File | Settings | File Templates.
 */


import java.util.*;


public class ShoppingList {

	public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        int answer = 0;

        do{

            //Print the main menu
            final String MENULINE1 = "\nCurrent available commands:";
            final String MENULINE2 = "\n1 --> Print Shopping List";
            final String MENULINE3 = "\n2 --> Add Item To Shopping List";
			final String MENULINE4 = "\n3 --> Remove Item From Shopping List";
            final String MENULINE9 = "\n9 --> Exit";

            System.out.println(MENULINE1 + MENULINE2 + MENULINE3 + MENULINE4 + MENULINE9);

            try{
                answer = console.nextInt();
            }
            //catch if anything other than an int
            catch (InputMismatchException exc){
                System.out.println("\nPlease select an appropriate answer.\nExiting...");
                System.exit(4);
            }

            System.out.println("");
            String inputString = null;
			int inputDate = 0;
            switch (answer){
                case 1:
                    System.out.println(""); //formatting
                    ListManager.printGroceryList(); //Send input, search, and print results
                    System.out.println(""); //formatting
                    break;

                case 2:
                    System.out.println(""); //
					System.out.println("Enter the new item name:\n"); //formatting
                    inputString = console.next(); //get user input
					System.out.println("Enter the new item date (08202013):\n"); //formatting
                    inputDate = console.nextInt(); //get user input
                    ListManager.addGroceryItem(inputString, inputDate);
                    System.out.println("Item added."); //formatting2
                    System.out.println(""); //formatting
					break;

				case 3:
					System.out.println(""); //
					System.out.println("Enter the item name to remove:\n"); //formatting
					inputString = console.next(); //get user input
					ListManager.removeGroceryItem(inputString);
					System.out.println("Item removed."); //formatting2
					System.out.println(""); //formatting
					break;

                case 9:
                    System.out.println("Goodbye.");
                    break;
            }

        }while(!(answer == 9) );

    }

}

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: JackAttack
 * Date: 8/19/13
 * Time: 10:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListManager {


	private static LinkedList<GroceryItem> GroceryList = new LinkedList<GroceryItem>();
	private static LinkedList<InventoryItem> InventoryList = new LinkedList<InventoryItem>();


	/**
	 *
	 * Following is for the Grocery List
	 *
	 */
	public static void printGroceryList(){
		//declare print counter
		int pCounter = 0;
		//for each Grocery Item in Grocery List
		for (int indexList = 0; indexList < GroceryList.size(); indexList++){
			GroceryItem cGroceryItem = GroceryList.get(indexList);

			String cItemName = cGroceryItem.getName();
			int cItemDate = cGroceryItem.getListingDate();

			printGroceryItem(cItemName, cItemDate);

			pCounter++;
		}

		if (pCounter == 0){
			System.out.println("No items in shopping list.");
		}
		else{
			System.out.println("");
		}
	}

	public static void printGroceryItem(String ItemName, int ItemDate){
		System.out.println(" - " + ItemName + " - Added On: " + ItemDate);
	}

	public static void addGroceryItem(String ItemName, int ItemDate){
		GroceryItem newItem = new GroceryItem(ItemName, ItemDate);
		GroceryList.add(newItem);
	}

	public static void removeGroceryItem(String ItemName){
		if (searchGroceryItemByName(ItemName) != -1){
			GroceryList.remove(searchGroceryItemByName(ItemName));
		}
		else{
			System.out.println("Aborting item removal.");
		}
	}

	//returns the index of the item searched by the name of the list object
	public static int searchGroceryItemByName(String ItemName){
		int itemIndex = -1;
		if (!GroceryList.isEmpty()){
			for (int indexList = 0; indexList < GroceryList.size(); indexList++){
				GroceryItem cGroceryItem = GroceryList.get(indexList);
				if (cGroceryItem.getName().equals(ItemName)){
					itemIndex = indexList;
				}
				else{
					itemIndex = -1;
				}
			}
		}
		else{
			System.out.println("List empty.");
			itemIndex = -1;
		}
		return itemIndex;
	}

	/**
	 * ^^^^Grocery List Managers^^^^^
	 */



	/**
	 *
	 * Following is for the Inventory List
	 *
	 */

	public static void printInventotyList(){
		//declare print counter
		int pCounter = 0;
		//for each Grocery Item in Grocery List
		for (int indexList = 0; indexList < InventoryList.size(); indexList++){
			InventoryItem cInventoryItem = InventoryList.get(indexList);

			String cItemName = cInventoryItem.getName();
			int cItemDate = cInventoryItem.getDate();
			double cItemPrice = cInventoryItem.getCost();
			int cItemQuant = cInventoryItem.getQuantity();

			printInventoryItem(cItemName, cItemDate, cItemPrice, cItemQuant);

			pCounter++;
		}

		if (pCounter == 0){
			System.out.println("No items in shopping list.");
		}
		else{
			System.out.println("");
		}
	}

	public static void printInventoryItem(String ItemName, int ItemDate, double ItemPrice, int ItemQuant){
		System.out.println(" - " + ItemName + " - Bought On: " + ItemDate + " - Purchase Price:" + ItemPrice + " - Quantity:" + ItemQuant);
	}

	public static void addInventoryItem(String ItemName, int ItemDate, double ItemPrice, int ItemQuant){
		InventoryItem newItem = new InventoryItem(ItemName, ItemDate, ItemPrice, ItemQuant);
		InventoryList.add(newItem);
	}

	public static void removeInventoryItem(String ItemName){
		if (searchInvItemByName(ItemName) != -1){
			InventoryList.remove(searchGroceryItemByName(ItemName));
		}
		else{
			System.out.println("Aborting item removal.");
		}
	}

	//returns the index of the item searched by the name of the list object
	public static int searchInvItemByName(String ItemName){
		int itemIndex = -1;
		if (!InventoryList.isEmpty()){
			for (int indexList = 0; indexList < InventoryList.size(); indexList++){
				InventoryItem cInvItem = InventoryList.get(indexList);
				if (cInvItem.getName().equals(ItemName)){
					itemIndex = indexList;
				}
				else{
					itemIndex = -1;
				}
			}
		}
		else{
			System.out.println("List empty.");
			itemIndex = -1;
		}
		return itemIndex;
	}

	/**
	 * ^^^^^^Inventory List Managers^^^^^^^^
	 */

}
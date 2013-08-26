/**
 * Created with IntelliJ IDEA.
 * User: JackAttack
 * Date: 8/21/13
 * Time: 1:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class InventoryItem {

	private String name;
	private int date;
	private double cost;
	private int quantity;

	public InventoryItem(String inputName, int inputDate, double inputCost, int inputQuantity){
		this.name = inputName;
		this.date = inputDate;
		this.cost = inputCost;
		this.quantity = inputQuantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

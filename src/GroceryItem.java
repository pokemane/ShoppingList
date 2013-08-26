/**
 * Created with IntelliJ IDEA.
 * User: JackAttack
 * Date: 8/19/13
 * Time: 6:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class GroceryItem {

    private String name;
    private int listingDate;

    public GroceryItem(String inputName, int inputDate) {
        this.name = inputName;
        this.listingDate = inputDate;
    }

    public String getName(){
        return this.name;
    }

    public int getListingDate(){
        return this.listingDate;
    }

    public void setName(String inputName){
        this.name = inputName;
    }

    public void setListingDate(int inputDate){
        this.listingDate = inputDate;
    }
}

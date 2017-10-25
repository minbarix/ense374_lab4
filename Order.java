import java.util.ArrayList;


public class Order{
    private Date dateReceived;
    private double price;
    private int orderID;

    Order(){
        ArrayList thisList = new ArrayList();
    }

    public void addOrderLine(int pID, int quantity){
        //create product with passed values
        //add to arraylist of orderLines
        double tempPrice = (quantity * database[pID].getPrice);
        OrderLine temp = new OrderLine(pID, quantity, tempPrice);
        thisList.add();
    }

    public Date getDateReceived(){
        return dateReceived;
    }

    public double calculatePrice(){
        //call getproduct
        //call getquantity
        //find base price
        //call getdiscountrating from customer
        //calculate final price with discount
        //return final orderprice to order application
    }
}
import java.util.ArrayList;

public class Order{
    private Date dateReceived;
    private double price;
    private int orderID;
    private Customer thisCustomer;

    public Order(){
        ArrayList<OrderLine> thisList = new ArrayList();
        //take customer input
    }

    public void addOrderLine(Product thisProduct, int quantity){
        //create product with passed values
        //add to arraylist of orderLines
        OrderLine temp = new OrderLine(thisProduct, quantity);
        thisList.add(temp);
    }

    public Date getDateReceived(){
        return dateReceived;
    }

    public double calculatePrice(){
        //call getproduct
        double sumPrice;
        for(int i = 0; i < thisList.size(); i++){
            double tempPrice = thisList.get(i).getPrice();
            sumPrice += tempPrice;
        }

       sumPrice *= thisCustomer.getDiscountRating();
       return sumPrice;

        //call getquantity
        //find base price
        //call getdiscountrating from customer
        //calculate final price with discount
        //return final orderprice to order application
    }
}
import java.util.ArrayList;

public class Order{
    private String dateReceived;
    private double price;
    private int orderID;
    private Customer thisCustomer;

    ArrayList<OrderLine> thisList = new ArrayList<OrderLine>();

    public Order(Customer inputCustomer){
        thisCustomer = inputCustomer;
    }

    public void addOrderLine(Product thisProduct, int quantity){
        OrderLine temp = new OrderLine(thisProduct, quantity);
        thisList.add(temp);
    }

    public String getDateReceived(){
        return dateReceived;
    }

    public double calculatePrice(){
        double sumPrice = 0;
        for(int i = 0; i < thisList.size(); i++){
            double tempPrice = thisList.get(i).getPrice();  //getting price from orderline
            sumPrice += tempPrice;  //base price of all items in the order
        }

       sumPrice *= thisCustomer.getDiscountRating();
       return sumPrice; //return price after applying discount rate
    }
}
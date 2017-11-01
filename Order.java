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

    public void deleteOrderLine(Product delProduct, int delQuantity){
        OrderLine removeLine = new OrderLine(delProduct, delQuantity);
        boolean ifDeleted = thisList.remove(removeLine);
        if(ifDeleted == true){
            System.out.println("The line was deleted!");
        }
        else{
            System.out.println("No match found for deletion");
        }
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
public class Order{
    private Date dateReceived;
    private double price;
    private int orderID;

    public Date getDateReceived(){
        return dateReceived;
    }
    public double calculatePrice(){

    }



}

public class OrderLine{
    private int quantity;
    private double price;

    OrderLine(Product product, int quantity, double price){

    }

    public Product getProduct(){
            //return a product
    }
    public int getQuantity(){
        return quantity;
    }
}
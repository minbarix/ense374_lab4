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
    public double getPrice(){
        return price;
    }
}

public class Product{
    private String name;
    private double price;
    private int productID;

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getProductID(){
        return productID;
    }

}

public class Customer{
    private String name;
    private String address;
    private float creditRating;
    private float discountRating;

    public float getCreditRating(){
        return creditRating;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public float getDiscountRating(){
        return discountRating;
    }
}
public class Product{
    private String name;
    private double price;
    private int productID;

    public void setName(String tempName){
        name = tempName;
    }

    public void setID(int tempID){
        productID = tempID;
    }

    public void setPrice(double tempPrice){
        price = tempPrice;
    }

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

public class OrderLine{
    private int quantity;
    private double price;
 //   private int productID;

    OrderLine(Product product, int inputQuantity){
        quantity = inputQuantity;
        price = (product.getPrice() * inputQuantity);
    }

    public Product getProduct(){
            //call getprice from the product
            return null;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
}
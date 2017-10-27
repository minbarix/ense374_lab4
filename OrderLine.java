
public class OrderLine{
    private int quantity;
    private Product currProduct;

    public OrderLine(Product product, int inputQuantity){
        currProduct = product;
        quantity = inputQuantity;
    }

    public Product getProduct(){
            return currProduct;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return currProduct.getPrice() * quantity;   //get price from product
    }
}

public class OrderLine{
    private int quantity;
  //  private double price;
 //   private int produ
    private Product currProduct;

    public OrderLine(Product product, int inputQuantity){
        currProduct = product;
        quantity = inputQuantity;
      //  price = (product.getPrice() * inputQuantity);
    }

    public Product getProduct(){
            return currProduct;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return currProduct.getPrice() * quantity;
    }
}
public class OrderApplication{
    public bool createOrder(Order){
        //called from main second
    }
    private boolean importCatalogue(){
        //gets called from main first
        Scanner input = new Scanner(Paths.get("ProductCatalogue.txt"));
        int maxNum = 10;

        Product[] database = new Product[10];

        for(int i = 0; i < maxNum; i++){
           database[i] = new Product();
           
           int productIDNum = input.next();
           database[i].setID(productIDNum);

           double productPrice = input.next();
           database[i].setPrice(productPrice);

           String productName = input.nextLine();
           database[i].setName(productName);
        }
    }
}



public class Order{
    private Date dateReceived;
    private double price;
    private int orderID;

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

public class OrderLine{
    private int quantity;
    private double price;

    OrderLine(Product product, int quantity, double price){

    }

    public Product getProduct(){
            //call getprice from the product
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

public class CorporateCustomer{
    private String contactName;
}

public class PersonalCustomer{
    private int creditCardNumber;
}
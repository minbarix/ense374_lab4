public class Customer{
    protected String name;
    protected String address;
    protected float creditRating;
    protected double discountRating;

    public float getCreditRating(){
        return creditRating;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getDiscountRating(){
        return discountRating;
    }
}
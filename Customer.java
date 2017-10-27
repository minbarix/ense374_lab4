public class Customer{
    protected String name;
    protected String address;
    protected float creditRating;
    protected float discountRating;

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
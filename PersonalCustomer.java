public class PersonalCustomer extends Customer{
    private int creditCardNumber;

    public PersonalCustomer(String ccn, String customerName, String caddress, float newcred, double newdiscount){
        creditCardNumber = ccn;
        name = customerName;
        address = caddress;
        creditRating = newcred;
        discountRating = newdiscount;
    }
}
public class CorporateCustomer extends Customer{
    private String contactName;
    public CorporateCustomer(String contact, String customerName, String caddress, float newcred, float newdiscount){
        contactName = contact;
        name = customerName;
        address = caddress;
        creditRating = newcred;
        discountRating = newdiscount;
    }
}

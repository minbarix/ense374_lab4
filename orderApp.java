

public class orderApp{
    public static void main(String[] args){
// pass customer when creating order

    CorporateCustomer Minbari = new CorporateCustomer("CEO", "Scott", "Regina, SK", 840.5, 0.85);
       Order thisOrder = new Order(Minbari);
       thisOrder.addOrderLine(database[1], 3);

        thisOrder.calculatePrice();


    }

}
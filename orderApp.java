

public class orderApp{
    public static void main(String[] args){

        OrderApplication Lab4 = new OrderApplication();

        boolean importTest = Lab4.importCatalogue();
       
    CorporateCustomer Minbari = new CorporateCustomer("CEO", "Scott", "Regina, SK", 840, 0.85);
       Order thisOrder = new Order(Minbari);
       thisOrder.addOrderLine(Lab4.database[1], 3);

       double cost = thisOrder.calculatePrice();
       System.out.println("The total order cost is: ");
       System.out.println(cost);




    }
}
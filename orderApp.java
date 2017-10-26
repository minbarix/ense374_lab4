

public class orderApp{
    public static void main(String[] args){

       Order thisOrder = new Order();
       thisOrder.addOrderLine(database[1], 3);

        thisOrder.calculatePrice();


    }

}
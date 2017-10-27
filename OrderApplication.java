import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;

public class OrderApplication{
   Product[] database = new Product[10];

    public boolean createOrder(Order tempOrder){
        //called from main second
        return true;
    }

    public boolean importCatalogue(){
      try{  Scanner input = new Scanner(Paths.get("ProductCatalogue.txt"));
        int maxNum = 10;

      //  Product[] database = new Product[10];

        for(int i = 0; i < maxNum; i++){
           database[i] = new Product();
           
           int productIDNum = input.nextInt();
           database[i].setID(productIDNum);

           double productPrice = input.nextDouble();
           database[i].setPrice(productPrice);

           String productName = input.nextLine();
           database[i].setName(productName);
        }
        return true;
    }
    catch(IOException e){
        e.printStackTrace();
        return false;
    }


    }
}

public class OrderApplication{

    public bool createOrder(Order tempOrder){
        //called from main second
    }

    public boolean importCatalogue(){
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

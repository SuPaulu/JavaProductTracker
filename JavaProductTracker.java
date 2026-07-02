package JavaProductTracker;


//scanner class for user input
import java.util.Scanner;


//product class
class Item{
    //product attribute and methods
    String productName;
    int qty, prodID;
    
    //object constructor method for easier input
    public Item(String productName, int qty, int prodId){
        this.productName = productName;
        this.qty = qty;    
        this.prodID = prodID;
    }
    
    //object output method
    void introduceItem(){
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + prodID);
        System.out.println("Quantity: " + qty);
    }
}

public class JavaProductTracker {
  
    public static void main(String[] args) {
        //new scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many product in stock?: ");
        int prodInStock = input.nextInt();
        
        //declaration of a new object array
        Item[] itemList;
        itemList = new Item[prodInStock];
        
        //clears the scanner buffer left when the user presses enter.
        input.nextLine();
        
        //parameterized for loop for the stock auditing logic
        for(int i = 0; i < prodInStock; i++)
        {
            System.out.println("Insert Product Name: ");
            String tempProdName = input.nextLine();
            
            System.out.println("Insert Product ID: ");
            int tempProdID = input.nextInt();
            
            System.out.println("Insert Stock Quantity");
            int tempProdQty = input.nextInt();
            
            //inputs user input every loop iteration
            itemList[i] = new Item(tempProdName, tempProdQty, tempProdID);
            input.nextLine();
        }
        
        //for loop for object method call
        for(int i = 0; i < prodInStock; i++){
            itemList[i].introduceItem();
        }
        
    }
    
}

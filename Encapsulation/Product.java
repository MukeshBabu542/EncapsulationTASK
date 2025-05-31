package Encapsulation;

public class Product {
    private String name;
    private int product_id;
    private Double price;
    // constructor to get value
      public Product(String productName, int productId, double price, int stockQuantity) {
        this.name = productName;
        this.product_id = productId;
        this.price = price;
        this.stock_quantity = stockQuantity;
    }
    
    // public getter method for name
    public String getName(){
        return name;
    }
    // public setter method for name
    public void setName(String name){
        this.name=name;
    }
    // for product_id
    public int getId(){
        return product_id;
    }
    public void setId(int product_id){
        this.product_id=product_id;
    }
    // getter for price
    public double getPrice(){
        return price;
    }
    // setter for price
    public void setPrice(double price){
        // validation
        if(price>0){
            this.price=price;
        }else{
            System.out.println("Price should be positive.");
        }
    }
    // private variable to track the stock quantity
    private int stock_quantity;
    // public method for getter and setter for stock_quantity
    public int getStock(){
        return stock_quantity; 
    }
    // stock update garne product kinesi kina ki purchase garesi ghatcha
// quantity as param because we need to update stock_quantity
   public void purchasProduct(int quantity){
    if(stock_quantity>=quantity){
        stock_quantity -=quantity;
    }else{
        System.out.println("Not enough stock available");
    }
   }
   public void restockProduct(int quantity){
    stock_quantity +=quantity;
   }
    public static void main(String[] args) {
        Product objProduct = new Product("Tshirt", 101, 20000, 20);
        // display setted details
         System.out.println("Initial Product Details:");
        System.out.println("ID: " + objProduct.getId());
        System.out.println("Name: " + objProduct.getName());
        System.out.println("Price: Rs. " + objProduct.getPrice());
        System.out.println("Stock: " + objProduct.getStock());
        // testing product
        try{
            objProduct.purchasProduct(2);
            System.out.println("Remained stock after buying :"+objProduct.getStock());
        }catch(IllegalArgumentException e){
            System.out.println("error");
            
        }
        // checking for -ve price
        try{
            objProduct.setPrice(-100);
            // System.out.println("Remained stock after buying :"+objProduct.getStock());
        }catch(IllegalArgumentException e){
            System.out.println("error");
            
        }
    }
    
}

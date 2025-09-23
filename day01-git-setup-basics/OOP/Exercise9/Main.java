public class Main{
  public static void main(String[] args) {    
    Store cookieShop = new Store("cookies",12,3.75);

    System.out.println("We have " + cookieShop.inventoryCount + " " + cookieShop.productType + " that cost $" + cookieShop.inventoryPrice + " each.");
  }
}
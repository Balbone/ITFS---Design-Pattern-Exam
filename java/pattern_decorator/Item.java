public class Item {

   private String name;
   private int price, quantity;

   public Item(String name, int price, int quantity) {
      this.name = name;
      this.price = price;
      this.quantity = quantity;
   }

   public String getName() {
      return name;
   }

   public int getPrice() {
      return price;
   }

   public int getQuantity() {
      return quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public String toString() {
      return " - item: " + name + ", price: " + price + "$, quantity: " + quantity + "\n";
   }
}
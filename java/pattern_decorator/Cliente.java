/*
La responsabilità particolare di un utente con il ruolo di cliente sono codificate nell’obj Cliente.
Questa classe estende le funzioni del Decorator, particolarmente aggiungendo...
*/

/*
Il cliente deve poter scegliere i propri vestiti, aggiungerli ad un carrello e acquistarli tramite pagamento online.
 */


public class Cliente extends Ruolo {

   private int numItems = 0;
   private Item[] cart; // Il carrello è definito come un array di objs (Items)

   public Cliente(User userC) {
      super(userC);
      this.cart = new Item[10]; // Il carrello non può avere più di 10 items
   }

   public void userInfo() {
      sayIamClient();
      super.userInfo();
      System.out.println("Number of items in the cart: " + getNumItems());
   }

   private void sayIamClient() {
      System.out.print("I am a client. ");
   }

   public int getNumItems() {
      return numItems;
   }

   public String toString() {
      String s = "Carrello:\n";

      int i = 0;
      int items_counter = 0;
      while (i < numItems) {
         items_counter += cart[i].getQuantity();
         s = s + cart[i].toString() + "\n";
         ++i;
      }
      s += "Numero totale di items: " + items_counter + "\n";

      return s;
   }

   private int findIndex(String n) {
      int i = 0;
      while (i < numItems) {
         if (cart[i].getName().equalsIgnoreCase(n)) return i;
         ++i;
      }

      return numItems;
   }

   public boolean present(String n) {
      return (findIndex(n) < numItems);
   }

   public boolean fullChart() {
      return (numItems == cart.length);
   }

   public boolean addToChart(String n, int p, int q) {
      if (present(n)) {
         int old_quantity = cart[findIndex(n)].getQuantity();
         cart[findIndex(n)].setQuantity(old_quantity + q);
         return true;
      }
      if (fullChart()) return false;
      cart[numItems] = new Item(n, p, q);
      ++numItems;
      return true;
   }

   public boolean removeFromChart(String n) {
      int i = findIndex(n);
      if (i == numItems) return false;
      --numItems;
      cart[i] = cart[numItems];
      return true;
   }

   public boolean pay() {
      if (numItems == 0) {
         System.out.println("Cestino vuoto, pagamento non andato a buon fine.");
         return false;
      } else {

         int i = 0;
         int bill = 0;
         while (i < numItems) {
            bill += cart[i].getQuantity() * cart[i].getPrice();
            ++i;
         }

         System.out.println("Prodotti acquistati:\n" + this + "Saldo totale pagato: " + bill + "$");
         this.numItems = 0;
         this.cart = new Item[10];
         return true;
      }
   }
}
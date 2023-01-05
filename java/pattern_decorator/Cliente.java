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
      System.out.println("Numero di items nel carrello: " + getNumItems());
   }

   private void sayIamClient() {
      System.out.print("Sono un cliente. ");
   }

   public String toString() {
      String s = "Carrello:\n";

      int i = 0;
      int items_counter = 0;
      while (i < numItems) {
         items_counter += cart[i].getQuantity();
         s = s + cart[i].toString();
         ++i;
      }
      s += "Numero totale di items: " + items_counter + "\n";

      return s;
   }

   public int getNumItems() {
      return numItems;
   }

   private int findIndex(String n) {
      int i = 0;
      while (i < numItems) {
         if (cart[i].getName().equalsIgnoreCase(n)) return i;
         ++i;
      }

      return numItems;
   }

   public boolean chartIsFull() {
      return (numItems == cart.length);
   }

   public boolean addToChart(Magazzino m, String n, int q) {
      if (chartIsFull()) return false;
      if (m.isPresent(n)) {
         if (q < m.checkAvailability(n)) {
            cart[numItems] = m.sell(n, q);
            ++numItems;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean removeFromChart(String n) {
      int i = findIndex(n);
      if (i == numItems) return false;
      --numItems;
      cart[i] = cart[numItems];
      return true;
   }

   public boolean pay(Magazzino m) {
      if (numItems == 0) {
         System.out.println("Cestino vuoto, pagamento non andato a buon fine.");
         return false;
      } else {

         int i = 0;
         int bill = 0;
         while (i < numItems) {
            m.addOrder(this.getEmail(), cart[i].getName(), cart[i].getPrice(), cart[i].getQuantity());
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
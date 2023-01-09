/*
Componente ConcreteStrategy della seconda componente Strategy.
 */
public class ConcreteCliente implements Cliente {

   private int numItems = 0;

   private Item[] cart; // Il carrello è definito come un array di oggetti Item

   public ConcreteCliente() {
      this.cart = new Item[10]; // Il carrello non può avere più di 10 items
   }

   public void userInfo() {
      System.out.print("Ora sono anche un utente cliente.\n");
      System.out.println("Numero di items nel carrello: " + getNumItems());
   }

   public String toString() {
      String s = "Carrello: ";

      if (numItems > 0) {
         s += "\n";
         int i = 0;
         int items_counter = 0;
         while (i < numItems) {
            items_counter += cart[i].getQuantity();
            s = s + cart[i].toString();
            ++i;
         }
         s += "Numero totale di items: " + items_counter + "\n";
      } else {
         s += "vuoto\n";
      }

      return s;
   }

   private int getNumItems() {
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

   private boolean chartIsFull() {
      return (numItems == cart.length);
   }

   /*
  La responsabilità aggiuntiva principale assegnata a un cliente è quella di poter aggiungere o togliere vestiti dal carrello.
  */
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

   /*
  Un utente decorato con il ruolo di cliente puo anche ordinare la merce scelta pagando.
  */
   public boolean pay(User u, Magazzino m) {
      if (numItems == 0) {
         System.out.println("Cestino vuoto, pagamento non andato a buon fine.");
         return false;
      } else {

         int i = 0;
         int bill = 0;
         while (i < numItems) {
            m.addOrder(u.getEmail(), cart[i].getName(), cart[i].getPrice(), cart[i].getQuantity());
            bill += cart[i].getQuantity() * cart[i].getPrice();
            ++i;
         }

         System.out.println("Saldo totale pagato: " + bill + "$");

         this.numItems = 0;
         this.cart = new Item[10];
         return true;
      }
   }
}
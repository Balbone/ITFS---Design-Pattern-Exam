public class Magazzino {

   private int numItemsMag;

   private int numItemsOrd;

   private Item[] magazzino; // Un magazzino contiene Items sottoforma di array di objs

   private Ordine[] ordini; // Un magazzino contiene gli ordini sottoforma di array di Ordini

   public Magazzino() {
      numItemsMag = 0;
      magazzino = new Item[20];
      ordini = new Ordine[20];
   }

   public String toString() {
      int i = 0;
      int counter = 0;

      String s = "Magazzino:\n";

      while (i < numItemsMag) {
         s = s + magazzino[i].toString();
         counter = counter + magazzino[i].getQuantity();
         ++i;
      }
      s = s + "Numero totale di items presenti: " + counter;

      return s;
   }

   private int findIndex(String n) {
      int i = 0;

      while (i < numItemsMag) {
         if (magazzino[i].getName().equalsIgnoreCase(n)) return i;
         ++i;
      }

      return numItemsMag;
   }

   public boolean isPresent(String n) {
      return (findIndex(n) < numItemsMag);
   }


   public int checkAvailability(String n) {
      int i = findIndex(n);
      if (i < numItemsMag) return magazzino[i].getQuantity();
      else return 0;
   }

   // Inizializzo il magazzino con una serie di oggetti che contiene nizialmente
   public boolean initMagazzino(String n, int p, int q) {
      magazzino[numItemsMag] = new Item(n, p, q);
      ++numItemsMag;
      return true;
   }

   public Item sell(String n, int q) {
      int i = 0;

      while (i < numItemsMag) {
         if (magazzino[i].getName().equalsIgnoreCase(n)) break;
         ++i;
      }

      int old_quantity = magazzino[i].getQuantity();
      magazzino[i].setQuantity(old_quantity - q);

      return new Item(n, magazzino[i].getPrice(), q);
   }

   public boolean addOrder(String e, String n, int p, int q) {
      ordini[numItemsOrd] = new Ordine(e, n, p, q);
      ++numItemsOrd;
      return true;
   }

   public boolean hasOrders() {
      return (numItemsOrd > 0);
   }

   public String getOrders() {
      int i = 0;
      int counter = 0;

      String s = "Ordini in attesa di essere evasi:\n";

      while (i < numItemsOrd) {
         s = s + ordini[i].toString();
         counter = counter + ordini[i].getQuantity();
         ++i;
      }
      s = s + "Numero totale di items da spedire: " + counter;

      return s;
   }
}
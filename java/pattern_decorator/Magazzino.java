public class Magazzino {

   private int numItems;

   private Item[] magazzino;

   public Magazzino() {
      numItems = 0;
      magazzino = new Item[20];
   }

   public String toString() {
      int i = 0;
      int counter = 0;

      String s = "Magazzino:\n";

      while (i < numItems) {
         s = s + magazzino[i].toString();
         counter = counter + magazzino[i].getQuantity();
         ++i;
      }
      s = s + "Numero totale di items presenti: " + counter;

      return s;
   }

   private int findIndex(String n) {
      int i = 0;

      while (i < numItems) {
         if (magazzino[i].getName().equalsIgnoreCase(n)) return i;
         ++i;
      }

      return numItems;
   }

   public boolean isPresent(String n) {
      return (findIndex(n) < numItems);
   }


   public int checkAvailability(String n) {
      int i = findIndex(n);
      if (i < numItems) return magazzino[i].getQuantity();
      else return 0;
   }

   public boolean full() {
      return (numItems == magazzino.length);
   }


   public boolean addToMagazzino(String n, int p, int q) {
      if (isPresent(n)) {
         int old_quantity = magazzino[findIndex(n)].getQuantity();
         magazzino[findIndex(n)].setQuantity(old_quantity + q);
         return true;
      }
      if (full()) return false;
      magazzino[numItems] = new Item(n, p, q);
      ++numItems;
      return true;
   }

   public boolean initMagazzino(String n, int p, int q) {
      magazzino[numItems] = new Item(n, p, q);
      ++numItems;
      return true;
   }

   public boolean remove(String n) {
      int i = findIndex(n);
      if (i == numItems) return false;
      --numItems;
      magazzino[i] = magazzino[numItems];
      return true;
   }

   public Item sell(String n, int q){
      int i = 0;

      while (i < numItems) {
         if (magazzino[i].getName().equalsIgnoreCase(n)) break;
         ++i;
      }

      int old_quantity = magazzino[i].getQuantity();
      magazzino[i].setQuantity(old_quantity - q);

      return new Item(n, magazzino[i].getPrice(), q);
   }
}
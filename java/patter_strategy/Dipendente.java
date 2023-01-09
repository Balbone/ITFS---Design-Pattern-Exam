/*
Primo componente Strategy del pattern Strategy.
*/
public interface Dipendente {

   public void assegnaRuoloCliente(Cliente c);

   public void userInfo(User u);

   public String toString();

   public void display(User u);

   public void checkOrders(Magazzino m);

   public boolean addToChart(Magazzino m, String n, int q);

   public boolean pay(User u, Magazzino m);
}
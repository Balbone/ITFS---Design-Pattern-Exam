/*
Primo componente Strategy del pattern Strategy.
*/
public interface Dipendente {

   public void assegnaRuoloCliente( Cliente c);

   public void userInfo(User u);

   public void display(User u);

   public void checkOrders(Magazzino m);
}
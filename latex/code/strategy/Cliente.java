/*
Seconda componente Strategy del pattern Strategy.
*/
public interface Cliente {

   public void userInfo();

   public String toString();

   public boolean addToChart(Magazzino m, String n, int q);

   public boolean pay(User u, Magazzino m);
}
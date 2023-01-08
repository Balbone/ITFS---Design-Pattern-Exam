/*
Specifica la interfaccia degli objs User, che possono essere decorati dinamicamente con nuove caratteristiche. Tutti le componenti del pattern Decorator implementano la interfaccia User, viene detta "Component".
*/

public interface User {

   public void login();

   public void assignJob();

   public String getUsername();

   public String getEmail();

   public String getPwd();

   public void userInfo();

   public boolean addToChart(Magazzino m, String n, int q);

   public boolean removeFromChart(String n);

   public boolean pay(Magazzino m);

   public void checkOrders(Magazzino m);
}
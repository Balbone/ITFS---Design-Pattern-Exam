/*
Specifica l’interfaccia degli obj User, che possono essere decorati dinamicamente con nuove funzionalità.
Tutti le componenti del pattern Decorator implementano l’interfaccia User, detta "Component".
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

   public boolean pay();
}
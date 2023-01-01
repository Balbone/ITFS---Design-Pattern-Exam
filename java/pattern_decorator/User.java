/*
Specifica l’interfaccia degli obj User, che possono essere decorati dinamicamente con nuove funzionalità.
Tutti le componenti del pattern Decorator implementano l’interfaccia User, detta "Component".
*/

public interface User {

   public String getUsername();

   public String getEmail();

   public String getPwd();

   public void userInfo();

   public boolean addToChart(String n, int p, int q);

   public boolean removeFromChart(String n);
}
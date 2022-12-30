/*
Specifica l’interfaccia degli obj User, che possono essere decorati dinamicamente con nuove funzionalità.
Tutti le componenti del pattern Decorator implementano l’interfaccia User, detta "Component".
*/

public interface User {
   public String getName();
   public String getOffice();
   public void whoIs();
}
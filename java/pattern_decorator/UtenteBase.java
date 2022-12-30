/*
Definisce l’obj UtenteBase implementando l'interfaccia User, a cui si possono aggiungere nuove funzionalità.
Questa componente del pattern Decorator è detta "ConcreteComponent".
 */

public class UtenteBase implements User {
   private String name, office;

   public UtenteBase(String name, String office) {
      this.name = name;
      this.office = office;
   }

   public String getName() {
      return name;
   }

   public String getOffice() {
      return office;
   }

   public void whoIs() {
      System.out.println("I am " + getName() + ", and I am with the "
              + getOffice() + ".");
   }
}
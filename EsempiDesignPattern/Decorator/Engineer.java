// Tutti i componenti di questo modello implementano l’interfaccia Employee

public class Engineer implements Employee {
   private String name, office;

   public Engineer( String nam, String off ) {
      name = nam;
      office = off;
   }
   public String getName() {
      return name ;
   }
   public String getOffice() {
      return office ;
   }
   public void whoIs() {
      System.out.println( "I am " + getName() + ", and I am with the " + getOffice() +".");
   };
}
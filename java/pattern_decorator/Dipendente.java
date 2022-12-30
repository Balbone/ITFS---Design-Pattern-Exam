/*
La classe Dipendente, invece estende le variabili di stato
dell’oggetto decorato, e modifica il comportamento dell’oggetto ...
*/

public class Dipendente extends Ruolo {

   private String project;

   public Dipendente( User userD, String proj ) {
      super( userD );
      project = proj;
   }

   public void whoIs() {
      super.whoIs();
      System.out.println( "I am the Manager of the Project:" + project );
   }
}
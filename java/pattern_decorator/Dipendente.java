/*
La classe Dipendente, invece estende le variabili di stato
dell’oggetto decorato, e modifica il comportamento dell’oggetto ...
*/

/*
Il dipendente deve poter controllare gli ordini effettuati dai clienti e avere accesso alla gestione del magazzino.
 */

public class Dipendente extends Ruolo {

   private String project;

   public Dipendente(User userD, String proj) {
      super(userD);
      project = proj;
   }

   public void userInfo() {
      sayIamEmployee();
      super.userInfo();
      System.out.println("I am the Manager of the Project:" + project);
   }

   private void sayIamEmployee() {
      System.out.print("I am a employee. ");
   }

}
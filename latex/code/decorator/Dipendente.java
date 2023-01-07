/*
La classe Dipendente, invece estende le variabili di stato
dell’oggetto decorato, e modifica il comportamento dell’oggetto ...
*/

/*
Il dipendente deve poter controllare gli ordini effettuati dai clienti e
avere accesso alla gestione del magazzino.
 */

import java.util.Scanner;

public class Dipendente extends Ruolo {

   private static Scanner tastiera = new Scanner(System.in);

   private String job;

   public Dipendente(User userD, String job) {
      super(userD);
      this.job = job;
   }

   public void assignJob() {
      System.out.println("Mansione: ");
      this.job = tastiera.nextLine();
   }

   public void userInfo() {
      sayIamEmployee();
      super.userInfo();
   }

   private void sayIamEmployee() {
      System.out.print("Sono un utente dipendente con la mansione di " + job + ". ");
   }

   /*
   La responsabilità aggiuntiva principale assegnata a un dipendente è quella
   di controllare gli ordini di vendita
   */
   public void checkOrders(Magazzino m) {
      if (m.hasOrders()) {
         System.out.println("Ordini presenti:\n");
         System.out.println(m.getOrders());
      } else {
         System.out.println("Nessun ordine presente.");
      }
   }
}
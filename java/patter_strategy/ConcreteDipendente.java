/*
Componente ConcreteStrategy della prima componente Strategy.
 */
public class ConcreteDipendente implements Dipendente {

   public Cliente cliente;

   private String job;

   public ConcreteDipendente(String job) {
      this.job = job;
   }

   public String getJob() {
      return job;
   }


   public void assegnaRuoloCliente( Cliente c ) {
      cliente = c;
   }

   public void userInfo(User u) {
      System.out.print(u);
      sayIamEmployee();
   }

   private void sayIamEmployee() {
      System.out.print("Sono un utente dipendente con la mansione di " + job +".\n");
   }

   public void display(User u) {
      this.userInfo(u);
      cliente.userInfo();
   }

   public void checkOrders(Magazzino m) {
      if (m.hasOrders()) {
         System.out.println(m.getOrders());
      } else {
         System.out.println("Nessun ordine presente.");
      }
   }
}
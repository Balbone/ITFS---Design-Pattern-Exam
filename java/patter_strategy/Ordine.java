public class Ordine extends Item {

   private String email;

   public Ordine(String email, String name, int price, int quantity) {
      super(name, price, quantity);
      this.email = email;
   }

   public String toString() {
      return "cliente: " + email + ", " + super.toString();
   }
}
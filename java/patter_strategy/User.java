/*
Componente Context del pattern Strategy. Contiene la parte di algoritmo comune sia al cliente che al dipendente.
 */

public class User {

   public Dipendente dipendente;

   private String username, email, pwd;

   public User(String username, String email, String pwd) {
      this.username = username;
      this.email = email;
      this.pwd = pwd;
   }

   public String getUsername() {
      return username;
   }

   public String getEmail() {
      return email;
   }

   public String getPwd() {
      return pwd;
   }

   public String toString(){
      return "\nusername: " + this.username + ", email: " + this.email + ", pwd: " + pwd + "\n";
   }

   public void assegnaRuoloDipendente( Dipendente d ) {
      dipendente = d;
   }

   public void display() {
      dipendente.userInfo(this);
   }

   public void checkOrders(Magazzino m){
      dipendente.checkOrders(m);
   }
}
/*
Definisce l’obj UtenteBase implementando l'interfaccia User, a cui si possono aggiungere nuove funzionalità.
Questa componente del pattern Decorator è detta "ConcreteComponent".
 */

public class UtenteBase implements User {

   private String username, email, pwd;

   public UtenteBase(String username, String email, String pwd) {
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

   public void userInfo() {
      System.out.println("Username: " + getUsername() + ", Email: " + getEmail());
   }

   public boolean addToChart(String n, int p, int q){
      return false;
   }

   public boolean removeFromChart(String n){
      return false;
   }

   public boolean pay(){
      return false;
   }
}
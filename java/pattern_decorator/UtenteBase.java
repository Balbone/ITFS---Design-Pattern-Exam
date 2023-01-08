/*
Definisce un obj UtenteBase implementando la interfaccia User, a cui si possono aggiungere nuove caratteristiche. Questa componente del pattern Decorator viene detta "ConcreteComponent".
 */

import java.util.Scanner;

public class UtenteBase implements User {

   private static Scanner tastiera = new Scanner(System.in);

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

   public void login() {
      System.out.println("username: ");
      this.username = tastiera.nextLine();
      System.out.println("email: ");
      this.email = tastiera.nextLine();
      System.out.println("password: ");
      this.pwd = tastiera.nextLine();
      tastiera.nextLine();
   }

   public void assignJob() {
   }

   public void userInfo() {
      System.out.println("Username: " + getUsername() + ", Email: " + getEmail());
   }

   public boolean addToChart(Magazzino m, String n, int q) {
      return false;
   }

   public boolean removeFromChart(String n) {
      return false;
   }

   public boolean pay(Magazzino m) {
      return false;
   }

   public void checkOrders(Magazzino m) {
   }
}
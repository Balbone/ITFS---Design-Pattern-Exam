/*
La classe astratta Ruolo corrisponde al Decorator del pattern.
Contiene il codice necessario per immagazzinare al suo interno l’oggetto decorato (Component),
e mappa verso di lui le operazioni richieste. Si noti che questa classe implementa l’intrerfaccia Employee,
e al suo interno utilizza questa stessa interfaccia per comunicare con il Component.
 */

abstract class Ruolo implements User {

   protected User appUser;

   public Ruolo(User user) {
      appUser = user;
   }

   public void login() {
   }

   public void assignJob() {
   }

   public String getUsername() {
      return appUser.getUsername();
   }

   public String getEmail() {
      return appUser.getEmail();
   }

   public String getPwd() {
      return appUser.getPwd();
   }

   public void userInfo() {
      appUser.userInfo();
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

   public void checkOrders(Magazzino m){}
}
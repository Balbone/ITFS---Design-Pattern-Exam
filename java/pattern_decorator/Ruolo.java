/*
La classe astratta Ruolo corrisponde al Decorator del pattern.
Contiene il codice necessario per immagazzinare al suo interno l’oggetto decorato (Component),
e mappa verso di lui le operazioni richieste. Si noti che questa classe implementa l’intrerfaccia Employee,
e al suo interno utilizza questa stessa interfaccia per comunicare con il Component.
 */

abstract class Ruolo implements User {
   protected User responsible;
   public Ruolo(User user) {
      responsible = user;
   }
   public String getName() {
      return responsible.getName();
   }
   public String getOffice() {
      return responsible.getOffice();
   }
   public void whoIs() {
      responsible.whoIs();
   }
}
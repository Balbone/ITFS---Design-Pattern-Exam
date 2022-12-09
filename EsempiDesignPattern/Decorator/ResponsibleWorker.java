// DECORATOR del modello. Contiene il codice necessario per immagazzinare al suo interno l’oggetto decorato (Component).
// Si noti che questa classe implementa l’intrerfaccia Employee, la quale viene per comunicare con il Component.

class ResponsibleWorker implements Employee {
   protected Employee responsible;

   public ResponsibleWorker(Employee employee) {
      responsible = employee;
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
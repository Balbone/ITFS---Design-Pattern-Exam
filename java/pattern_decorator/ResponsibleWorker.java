
abstract class ResponsibleWorker implements Employee {
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
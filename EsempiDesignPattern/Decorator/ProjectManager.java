// La classe ProjectManager, invece estende le variabili di stato dell’oggetto decorato, e modifica il comportamento
// dell’oggetto (metodo whoIs)

public class ProjectManager extends ResponsibleWorker {
   private String project;
   public ProjectManager( Employee empl, String proj ) {
      super( empl );
      project = proj;
   }
   public void whoIs() {
      super.whoIs();
      System.out.println( "I am the Manager of the Project:" + project );
   }
}
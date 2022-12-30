
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
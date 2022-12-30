
public class Dipendente extends Ruolo {
   private String project;
   public Dipendente( User userD, String proj ) {
      super( userD );
      project = proj;
   }
   public void whoIs() {
      super.whoIs();
      System.out.println( "I am the Manager of the Project:" + project );
   }
}
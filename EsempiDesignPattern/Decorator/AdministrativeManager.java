// La classe AdministrativeManager. Questa classe estende le funzioni del Decorator aggiungendo l’operazione sayIamBoss,
// che viene chiamata come parte della ridefinizione del metodo whoIs.

public class AdministrativeManager extends ResponsibleWorker {
   public AdministrativeManager( Employee empl ) {
      super( empl );
   }
   public void whoIs() {
      sayIamBoss();
      super.whoIs();
   }
   private void sayIamBoss(){
      System.out.print( "I am a boss. " );
   }
}
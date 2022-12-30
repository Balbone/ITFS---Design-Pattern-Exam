
public class Cliente extends Ruolo {
   public Cliente( User userC ) {
      super( userC );
   }
   public void whoIs() {
      sayIamBoss();
      super.whoIs();
   }
   private void sayIamBoss(){
      System.out.print( "I am a boss." );
   }
}
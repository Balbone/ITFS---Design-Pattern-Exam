/*
La responsabilità particolare di un utente con il ruolo di cliente sono codificate nell’obj Cliente.
Questa classe estende le funzioni del Decorator, particolarmente aggiungendo...
*/
public class Cliente extends Ruolo {

   public Cliente( User userC ) {
      super( userC );
   }

   public void userInfo() {
      sayIamClient();
      super.userInfo();
   }

   private void sayIamClient(){
      System.out.print( "I am a client." );
   }
}

public class DecoratorExample1 {
   public static void main(String arg[]) {
      User pippo = new UtenteBase( "William Gateway","Programming Department" );
      System.out.println( "Who are you?");
      pippo.whoIs();
      pippo = new Cliente( pippo );
      System.out.println( "Who are you now?");
      pippo.whoIs();
      pippo = new Dipendente( pippo,"D.O.S.- Doors Operating System" );
      System.out.println( "Who are you now?");
      pippo.whoIs();
      pippo = new Dipendente( pippo, "EveryoneLoggedToInternet Explorer" );
      System.out.println( "Who are you now?");
      pippo.whoIs();
   }
}
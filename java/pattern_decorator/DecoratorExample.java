
public class DecoratorExample {
   public static void main(String arg[]) {

      User pippo = new UtenteBase("William Gateway","Programming Department", "pollo123");
      System.out.println( "Who are you?");
      pippo.userInfo();

      pippo = new Cliente( pippo );
      System.out.println( "Who are you now?");
      pippo.userInfo();

      pippo = new Dipendente( pippo,"D.O.S.- Doors Operating System" );
      System.out.println( "Who are you now?");
      pippo.userInfo();

      pippo = new Dipendente( pippo, "EveryoneLoggedToInternet Explorer" );
      System.out.println( "Who are you now?");
      pippo.userInfo();
   }
}
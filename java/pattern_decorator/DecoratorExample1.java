
public class DecoratorExample1 {
   public static void main(String arg[]) {
      Employee pippo = new Engineer( "William Gateway","Programming Department" );
      System.out.println( "Who are you?");
      pippo.whoIs();
      pippo = new AdministrativeManager( pippo );
      System.out.println( "Who are you now?");
      pippo.whoIs();
      pippo = new ProjectManager( pippo,"D.O.S.- Doors Operating System" );
      System.out.println( "Who are you now?");
      pippo.whoIs();
      pippo = new ProjectManager( pippo, "EveryoneLoggedToInternet Explorer" );
      System.out.println( "Who are you now?");
      pippo.whoIs();
   }
}
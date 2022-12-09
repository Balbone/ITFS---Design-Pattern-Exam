// Applicazione che crea un Employee, lo investe come AdministrativeManager (per indicare che l’impiegato è capoufficio),
// e poi, due volte come ProjectManager (per segnare che l’impiegato è anche responsabile della gestione di due progetti)

public class DecoratorExample {
   public static void main(String arg[]) {
      Employee thisWillBeFamous = new Engineer( "William Gateway",
              "Programming Department" );
      System.out.println( "Who are you?");
      thisWillBeFamous.whoIs();
      thisWillBeFamous = new AdministrativeManager( thisWillBeFamous );
      System.out.println( "Who are you now?");
      thisWillBeFamous.whoIs();
      thisWillBeFamous = new ProjectManager( thisWillBeFamous,
              "D.O.S.- Doors Operating System" );
      System.out.println( "Who are you now?");
      thisWillBeFamous.whoIs();
      thisWillBeFamous = new ProjectManager( thisWillBeFamous,
              "EveryoneLoggedToInternet Explorer" );
      System.out.println( "Who are you now?");
      thisWillBeFamous.whoIs();
   }
}
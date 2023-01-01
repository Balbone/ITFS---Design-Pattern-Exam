
public class DecoratorExample {
   public static void main(String arg[]) {

      User pippo = new UtenteBase("William Gateway", "Programming Department", "pollo123");
      System.out.println("Who are you?");
      pippo.userInfo();

      pippo = new Cliente(pippo);
      System.out.println("Who are you now?");
      pippo.userInfo();

      System.out.println("Cestino degli acquisti:\n");
      pippo.addToChart("t-shirt", 33, 3);
      pippo.addToChart("cappello", 100, 1);
      pippo.addToChart("scarpe", 200, 1);
      pippo.addToChart("jeans", 90, 2);
      System.out.println(pippo);

      System.out.println("Rimuovo matita");
      pippo.removeFromChart("matita");
      System.out.println(pippo);
      System.out.println("Aggiungo una t-shirt (che e' gia' presente): successo = " + pippo.addToChart("t-shirt", 33, 1));
      System.out.println("Aggiungo una camicia (che non e' ancora presente): successo = " + pippo.addToChart("camicia", 110, 1));

      System.out.println(pippo);

      pippo.pay();
      System.out.println(pippo);


      pippo = new Dipendente(pippo, "D.O.S.- Doors Operating System");
      System.out.println("Who are you now?");
      pippo.userInfo();

      pippo = new Dipendente(pippo, "EveryoneLoggedToInternet Explorer");
      System.out.println("Who are you now?");
      pippo.userInfo();

   }
}
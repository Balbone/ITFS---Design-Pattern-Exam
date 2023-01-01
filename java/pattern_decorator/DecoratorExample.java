
public class DecoratorExample {
   public static void main(String arg[]) {

      User pippo = new UtenteBase("William Gateway", "Programming Department", "pollo123");
      System.out.println("Who are you?");
      pippo.userInfo();

      pippo = new Cliente(pippo);
      System.out.println("Who are you now?");
      pippo.userInfo();

      System.out.println("Cestino degli acquisti:\n");
      pippo.addToChart("matita", 3, 1);
      pippo.addToChart("biro", 1, 2);
      pippo.addToChart("colla", 2, 3);
      pippo.addToChart("diario", 5, 1);
      System.out.println(pippo);

      System.out.println("Rimuovo matita");
      pippo.removeFromChart("matita");
      System.out.println(pippo);
      System.out.println("Aggiungo diario (ma c'e' gia'): successo = " + pippo.addToChart("diario", 3, 1));
      System.out.println(pippo);


      pippo = new Dipendente(pippo, "D.O.S.- Doors Operating System");
      System.out.println("Who are you now?");
      pippo.userInfo();

      pippo = new Dipendente(pippo, "EveryoneLoggedToInternet Explorer");
      System.out.println("Who are you now?");
      pippo.userInfo();

   }
}
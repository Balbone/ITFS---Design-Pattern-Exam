
public class DecoratorExample {
   public static void main(String arg[]) {

      // Inizializzo il magazzino

      Magazzino ilMioMagazzino = new Magazzino();

      System.out.println(ilMioMagazzino);

      ilMioMagazzino.initMagazzino("t-shirt", 33, 30);
      ilMioMagazzino.initMagazzino("polo", 67, 20);
      ilMioMagazzino.initMagazzino("camicia", 90, 40);
      ilMioMagazzino.initMagazzino("giacca", 256, 10);
      ilMioMagazzino.initMagazzino("jeans", 80, 65);

      System.out.println(ilMioMagazzino);


      // Inizializzo uno user

      //System.out.println("SIGN UP per accedere all'applicazione dell'Atelier Splendor.");
      User anonymous = new UtenteBase("davide.marietti", "davide.marietti@me.it", "pollo123");
      //anonymous.login();

      //System.out.println("Informazioni sull'utente:");
      //anonymous.userInfo();

      // Test example for the CLIENT user
      anonymous = new Cliente(anonymous);
      //System.out.println("Informazioni sull'utente con ruolo di utente:");
      anonymous.userInfo();

      System.out.println("Cestino degli acquisti:\n");
      anonymous.addToChart(ilMioMagazzino, "t-shirt", 3);
      anonymous.addToChart(ilMioMagazzino,"giacca", 1);
      anonymous.addToChart(ilMioMagazzino,"jeans", 1);
      anonymous.addToChart(ilMioMagazzino,"camici",2);

      System.out.println(anonymous);
      System.out.println(ilMioMagazzino);

      /*

      System.out.println("Rimuovo matita");
      anonymous.removeFromChart("matita");
      System.out.println(anonymous);
      System.out.println("Aggiungo una t-shirt (che e' gia' presente): successo = " + anonymous.addToChart("t-shirt", 33, 1));
      System.out.println("Aggiungo una camicia (che non e' ancora presente): successo = " + anonymous.addToChart("camicia", 110, 1));

      System.out.println(anonymous);

      anonymous.pay();

      System.out.println(anonymous);


      // Test example for the EMPLOYEE user
      User pluto = new UtenteBase("pluto.dePlutopolis", "pluto@me.it", "pollo123");
      System.out.println("Informazioni sull'utente:");
      pluto.userInfo();

      pluto = new Dipendente(pluto, "");
      pluto.assignJob();
      System.out.println("Informazioni sull'utente:");
      pluto.userInfo();

      // Test example for the CLIENT-EMPLOYEE user
      anonymous = new Dipendente(anonymous, "");
      System.out.println("Informazioni sull'utente:");
      anonymous.userInfo();*/
   }
}
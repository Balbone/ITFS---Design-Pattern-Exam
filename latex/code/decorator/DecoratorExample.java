/*
Client per testare il micro prototipo.
*/

public class DecoratorExample {
   public static void main(String arg[]) {

      // Inizializzo il magazzino
      Magazzino magazzinoSplendor = new Magazzino();
      System.out.println("Il magazzino dell'Atelier Splendor è vuoto.");
      System.out.println(magazzinoSplendor);
      
      System.out.println("\nIl magazzino dell'Atelier Splendor viene riempito la sua nuova collezione autunno-inverno.");
      magazzinoSplendor.initMagazzino("t-shirt", 33, 30);
      magazzinoSplendor.initMagazzino("polo", 67, 20);
      magazzinoSplendor.initMagazzino("camicia", 90, 40);
      magazzinoSplendor.initMagazzino("giacca", 256, 10);
      magazzinoSplendor.initMagazzino("jeans", 80, 65);

      System.out.println(magazzinoSplendor);


      // Inizializzo un utente cliente

      //System.out.println("SIGN UP per accedere all'applicazione dell'Atelier Splendor.");
      User utente1 = new UtenteBase("marco.rossi", "marco.rossi@me.it", "pollo123");
      //marco.login();

      User marco = new Cliente(utente1);
      System.out.println("\nInformazioni sull'utente cliente:");
      marco.userInfo();

      // Marco aggiunge i seguenti items al suo cestino
      marco.addToChart(magazzinoSplendor, "t-shirt", 3);
      marco.addToChart(magazzinoSplendor, "giacca", 1);
      marco.addToChart(magazzinoSplendor, "jeans", 1);
      marco.addToChart(magazzinoSplendor, "camicia", 2);

      System.out.println("\nL'utente cliente Marco aggiunge i seguenti items al carrello:");
      System.out.println(marco);

      System.out.println("L'utente cliente Marco effettua l'ordine.");
      marco.pay(magazzinoSplendor);

      System.out.println("\nCestino degli acquisti dell'utente cliente Marco dopo l'acquisto:");
      System.out.println(marco);
      System.out.println("Il magazzino dell'Atelier Splendor dopo l'acquisto dell'utente cliente Marco:");
      System.out.println(magazzinoSplendor);


      // Inizializzo un utente dipendente

      User utente2 = new UtenteBase("chiara.genovese", "chiara.genovese@me.it", "querty99");
      //chiara.userInfo();

      User chiara = new Dipendente(utente2, "sarta");
      //chiara.assignJob();
      System.out.println("\nInformazioni sull'utente dipendente:");
      chiara.userInfo();

      System.out.println("\nL'utente dipendente Chiara controlla gli ordini da evadere.");
      chiara.checkOrders(magazzinoSplendor);


      // L'utente dipendente Chiara diventa anche un cliente dell'Atelier Splendor

      System.out.println("\nL'utente dipendente Chiara diventa anche un cliente dell'Atelier Splendor.");
      User chiara_cliente = new Cliente(chiara);
      System.out.println("Informazioni sull'utente dipendente-cliente:");
      chiara_cliente.userInfo();

      // Chiara aggiunge i seguenti items al suo cestino
      chiara_cliente.addToChart(magazzinoSplendor, "t-shirt", 1);
      chiara_cliente.addToChart(magazzinoSplendor, "giacca", 2);

      System.out.println("\nL'utente cliente-dipendente Chiara aggiunge i seguenti items al carrello:");
      System.out.println(chiara_cliente);

      System.out.println("L'utente cliente-dipendente Chiara effettua l'ordine ed è lei stessa che controlla gli ordini da evadere.");
      chiara_cliente.pay(magazzinoSplendor);
      chiara_cliente.checkOrders(magazzinoSplendor);
   }
}
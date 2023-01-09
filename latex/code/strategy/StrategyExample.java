public class StrategyExample {
   public static void main(String[] arg) {

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

      // Inizializzo l'utente
      User chiara = new User("chiara.genovese", "chiara.genovese@me.it", "qwerty99");

      // Ci assegno il ruolo di dipendente
      System.out.println("\nDefinisco un utente Chiara con il ruolo di dipendente.");
      Dipendente chiara_dipendente = new ConcreteDipendente("sarta");
      chiara.assegnaRuoloDipendente(chiara_dipendente);
      chiara.display();

      System.out.println("\nControllo se ci sono ordini da evadere nel magazzino:");
      chiara.checkOrders(magazzinoSplendor);

      // Ci assegno il anche ruolo di cliente
      System.out.println("\nAssegno a Chiara anche il ruolo di cliente.");
      Cliente chiara_cliente = new ConcreteCliente();
      chiara_dipendente.assegnaRuoloCliente(chiara_cliente);
      chiara_dipendente.display(chiara);

      // Chiara aggiunge i seguenti items al suo cestino
      chiara_dipendente.addToChart(magazzinoSplendor, "t-shirt", 3);
      chiara_dipendente.addToChart(magazzinoSplendor, "giacca", 1);
      chiara_dipendente.addToChart(magazzinoSplendor, "jeans", 1);
      chiara_dipendente.addToChart(magazzinoSplendor, "camicia", 2);

      System.out.println("\nChiara aggiunge i seguenti items al carrello:");
      System.out.println(chiara_dipendente);

      // Chiara effettua l'ordine
      System.out.println("Chiara effettua l'ordine.");
      chiara_dipendente.pay(chiara, magazzinoSplendor);

      System.out.println("\nCestino degli acquisti di Chiara dopo l'acquisto:");
      System.out.println(chiara_dipendente);

      System.out.println("Il magazzino dell'Atelier Splendor dopo l'acquisto di Chiara:");
      System.out.println(magazzinoSplendor);

      // Chiara stessa controlla gli ordini
      System.out.println("\nChiara ricontrolla gli ordini da evadere dopo il suo acquisto.");
      chiara.checkOrders(magazzinoSplendor);
   }
}
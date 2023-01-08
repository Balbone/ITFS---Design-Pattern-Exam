public class StrategyExample{
   public static void main (String[] arg) {

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
      User chiara = new User( "chiara.genovese" , "chiara.genovese@me.it", "qwerty99" );
      //chiara.display();

      Dipendente chiara_dipendente = new ConcreteDipendente("sarta");
      chiara.assegnaRuoloDipendente( chiara_dipendente );
      chiara.display();
      chiara.checkOrders(magazzinoSplendor);

      Cliente chiara_cliente = new ConcreteCliente();
      chiara_dipendente.assegnaRuoloCliente( chiara_cliente );
      chiara_dipendente.display(chiara);
   }
}
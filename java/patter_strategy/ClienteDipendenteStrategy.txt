package patter_strategy;

interface Ruolo {
   void print();
}

/* La classe pattern_decorator.UtenteApplicazione è il Context che mantiene al suo interno le carattetistiche
La particolare modalità di stampa rimane a carico di oggetti che implementano l’interfaccia pattern_decorator.patter_strategy.Utente.
Il particolare oggetto che incapsula la procedura di stampa scelta, viene settato tramite il metodo setRole,
intanto che la procedura stessa di stampa viene invocata tramite il metodo display.
*/
class Utente {
   private String nome;
   private String cognome;
   private int eta;

   Ruolo ruolo;

   public Utente (String n, String c, int e) {
      nome = n;
      cognome = c;
      eta = e;
   }

   public String getName() {
      return nome;
   }

   public void setRuolo( Ruolo r ) {
      ruolo = r;
   }
   public void display() {
      ruolo.print();
   }
}

// Questa classe Strategy implementa una strategia di stampa
class Dipendente implements Ruolo {
   void print() {
      System.out.println( "Sono un dipendente" );
   };
}

class Cliente implements Ruolo {
   void print(){
      System.out.println( "Sono un cliente" );
   };
}


public class ClienteDipendenteStrategy{
   public static void main (String[] arg) {

      pattern_decorator.Utente u = new pattern_decorator.Utente( "Davide" , "Marietti", 10 );

      u.setRuolo( new pattern_decorator.Cliente() );
      u.display();

      u.setRuolo( new pattern_decorator.Dipendente() );
      u.display();
   }
}
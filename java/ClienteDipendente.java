/*
 La classe Utente è la Component del Decorator. Specifica l’interfaccia degli oggetti che avranno caratteristiche aggiunte dinamicamente.
*/
interface Utente {
   String getName();

   void whoIs();

   void print();
}


/*
La classe Engineer è la ConcreteComponent del Decorator. Implementa l’oggetto in cui si possono aggiungere nuove responsabilità.
*/
class UtenteBase implements Utente {
   private String nome;
   private String cognome;
   private int eta;

   public UtenteBase(String n, String c, int e) {
      nome = n;
      cognome = c;
      eta = e;
   }

   public String getName() {
      return nome;
   }

   public void whoIs() {
      System.out.println("I am " + getName() + ".");
   }

   public void print() {
      System.out.println("Nome: " + nome);
      System.out.println("Cognome: " + cognome);
      System.out.println("Età: " + eta);
   }
}

/* La classe UtenteApplicazione è il Decorator. Contiene il codice necessario per immagazzinare l’oggetto decorato (Component), e mappa verso di lui le operazioni richieste.
Si noti come implementi l'interfaccia Utente.
*/
class UtenteApplicazione implements Utente {
   private Utente utente;

   public UtenteApplicazione(Utente u) {
      utente = u;
   }

   public String getName() {
      return utente.getName();
   }

   public void whoIs() {
      utente.whoIs();
   }

   public void print() {
      utente.print();
   }
}

/*
La caratteristiche tipiche del dipendete sono codificate nella classe Dipendente.
Questa classe estende le funzioni del Decorator, in particolare aggiungendo l’operazione sayIamDipendete, che viene chiamata come parte della ridefinizione del metodo whoIs.
Inoltre ridefinisce il metodo print e aggiunge all'UtenteApplicazione l'attributo stipendio.
*/
class Dipendente extends UtenteApplicazione {
   private int stipendio;

   public Dipendente(Utente u, int s) {
      super(u);
      stipendio = s;
   }

   private void sayIamDipendente() {
      System.out.print("I am a dipendente.");
   }

   public void print() {
      super.print();
      System.out.println("Stipendio: " + stipendio);
   }
}

/*
Come sopra, ridefinisce il metodo print e aggiunge all'UtenteApplicazione l'attributo carrello.
 */
class Cliente extends UtenteApplicazione {
   private String carrello;

   public Cliente(Utente u, String c) {
      super(u);
      carrello = c;
   }

   public void print() {
      super.print();
      System.out.println("Carrello: " + carrello);
   }
}

/*
Creo un Utente che è sia dipendente, che cliente.
*/
public class ClienteDipendente {
   public static void main(String[] args) {

      Utente davide = new UtenteBase("Davide", "Marietti", 28);
      System.out.println("-- Vediamo le info di base:");
      davide.print();

      Utente dip = new Dipendente(davide, 1000);
      System.out.println("-- Vediamo le info di base più lo stipendio:");
      dip.print();

      Utente cli = new Cliente(dip, "300");
      System.out.println("-- Vediamo le info di base più lo stipendio e il carrello:");
      cli.print();
   }
}
// La classe MyArray (Context) che mantiene al suo interno un array di numeri, gestiti tramite i metodi setValue e getValue.
// La particolare modalità di stampa rimane a carico di oggetti che implementano l’interfaccia ArrayDisplayFormat.
// Il particolare oggetto che incapsula la procedura di stampa scelta, viene settato tramite il metodo setDisplayFormat,
// intanto che la procedura stessa di stampa viene invocata tramite il metodo display

public class MyArray {
   private int[] array;
   private int size;
   ArrayDisplayFormat format;
   public MyArray( int size ) {
      array = new int[ size ];
   }
   public void setValue( int pos, int value ) {
      array[pos] = value;
   }
   public int getValue( int pos ) {
      return array[pos];
   }
   public int getLength( int pos ) {
      return array.length;
   }
   public void setDisplayFormat( ArrayDisplayFormat adf ) {
      format = adf;
   }
   public void display() {
      format.printData( array );
   }
}
public interface ArrayDisplayFormat {
   public void printData( int[] arr );
}

// La classe MyArray è il Context) che mantiene al suo interno un array di numeri, gestiti tramite i metodi setValue e getValue.
// La particolare modalità di stampa rimane a carico di oggetti che implementano l’interfaccia ArrayDisplayFormat.
// Il particolare oggetto che incapsula la procedura di stampa scelta, viene settato tramite il metodo setDisplayFormat,
// intanto che la procedura stessa di stampa viene invocata tramite il metodo display

class MyArray {
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

// Le strategie di stampa sono implementate nelle classi StandardFormat (per il formato “{ a, b, c, … }”) e
// MathFormat (per il formato “Arr[0]=a Arr[1]=b Arr[2]=c …”)
class StandardFormat implements ArrayDisplayFormat {
   public void printData( int[] arr ) {
      System.out.print( "{ " );
      for(int i=0; i < arr.length-1 ; i++ )
         System.out.print( arr[i] + ", " );
      System.out.println( arr[arr.length-1] + " }" );
   }
}

// Le strategie di stampa sono implementate nelle classi StandardFormat (per il formato “{ a, b, c, … }”) e
// MathFormat (per il formato “Arr[0]=a Arr[1]=b Arr[2]=c …”)
class MathFormat implements ArrayDisplayFormat {
   public void printData( int[] arr ) {
      for(int i=0; i < arr.length ; i++ )
         System.out.println( "Arr[ " + i + " ] = " + arr[i] );
   }
}


public class StrategyExample {
   public static void main (String[] arg) {
      MyArray m = new MyArray( 10 );
      m.setValue( 1 , 6 );
      m.setValue( 0 , 8 );
      m.setValue( 4 , 1 );
      m.setValue( 9 , 7 );
      System.out.println("This is the array in ’standard’ format");
      m.setDisplayFormat( new StandardFormat() );
      m.display();
      System.out.println("This is the array in ’math’ format:");
      m.setDisplayFormat( new MathFormat() );
      m.display();
   }
}
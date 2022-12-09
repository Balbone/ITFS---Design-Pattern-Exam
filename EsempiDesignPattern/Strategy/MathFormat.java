// Le strategie di stampa sono implementate nelle classi StandardFormat (per il formato “{ a, b, c, … }”) e
// MathFormat (per il formato “Arr[0]=a Arr[1]=b Arr[2]=c …”)

public class MathFormat implements ArrayDisplayFormat {
   public void printData( int[] arr ) {
      for(int i=0; i < arr.length ; i++ )
         System.out.println( "Arr[ " + i + " ] = " + arr[i] );
   }
}
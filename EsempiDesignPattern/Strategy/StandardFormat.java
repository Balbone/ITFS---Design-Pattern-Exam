// Le strategie di stampa sono implementate nelle classi StandardFormat (per il formato “{ a, b, c, … }”) e
// MathFormat (per il formato “Arr[0]=a Arr[1]=b Arr[2]=c …”)

public class StandardFormat implements ArrayDisplayFormat {
   public void printData( int[] arr ) {
      System.out.print( "{ " );
      for(int i=0; i < arr.length-1 ; i++ )
         System.out.print( arr[i] + ", " );
      System.out.println( arr[arr.length-1] + " }" );
   }
}
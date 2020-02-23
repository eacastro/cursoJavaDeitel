package variablesFinal;

// Variable final inicializada con el argumento de un constructor
public class PruebaIncremento
{

	public static void main( String[] args )
	{
		
		Incremento valor = new Incremento( 5 );
		
		System.out.printf( "Antes de incrementar: %s\n\n", valor ); // Llamada implícita a toString
		
		for( int i = 1; i <= 3; i++ ) 
		{
			
			valor.sumarIncrementoATotal();
			System.out.printf( "Después de incrementar %d: %s\n", i, valor ); // Llamada implícita
																			  // a toString
			
		} // Fin de for
		
	} // Fin del método main
		
} // Fin de la clase PruebaIncremento

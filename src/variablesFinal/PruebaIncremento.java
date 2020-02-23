package variablesFinal;

// Variable final inicializada con el argumento de un constructor
public class PruebaIncremento
{

	public static void main( String[] args )
	{
		
		Incremento valor = new Incremento( 5 );
		
		System.out.printf( "Antes de incrementar: %s\n\n", valor ); // Llamada impl�cita a toString
		
		for( int i = 1; i <= 3; i++ ) 
		{
			
			valor.sumarIncrementoATotal();
			System.out.printf( "Despu�s de incrementar %d: %s\n", i, valor ); // Llamada impl�cita
																			  // a toString
			
		} // Fin de for
		
	} // Fin del m�todo main
		
} // Fin de la clase PruebaIncremento

// Los miembros con acceso a nivel de paquete de una clase son accesibles
// para las demás clases en el mismo paquete.
package accesoPaquetes;

public class PruebaDatosPaquete 
{
	
	public static void main( String[] args ) 
	{
			
		DatosPaquete datosPaquete = new DatosPaquete();
		
		// Imprime la representación String de datosPaquete
		System.out.printf( "Despues de instanciar:\n%s\n", datosPaquete );
		
		// Modifica los datos con acceso a nivel de paquete en el objeto datosPaquete
		datosPaquete.numero = 77;
		datosPaquete.cadena = "Adios";
		
		// Imprime la representación String de datosPaquete
		System.out.printf( "\nDespues de modificar valores:\n%s\n", datosPaquete );
		
	} // Fin del metodo main	
	
} // Fin de la clase PruebaDatosPaquete

class DatosPaquete
{
	
	int numero; // Variable de instancia con acceso a nivel de paquete
	String cadena; // Variable de instancia con acceso a nivel de paquete
	
	// Constructor
	public DatosPaquete() 
	{
		
		numero = 0;
		cadena = "Hola";
		
	} // Fin del método constructor
	
	// Devuelve la representación String del objeto DatosPaquete
	public String toString() 
	{
		
		return String.format( "numero: %d; cadena: %s", numero, cadena );
		
	} // Fin del método toString
	
} // Fin DatosPaquete

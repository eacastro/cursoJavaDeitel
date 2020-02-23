package variablesFinal;
// Variable de instancia final en una clase

public class Incremento 
{
	
	private int total = 0; // El total de todos los incrementos
	private final int INCREMENTO; // Variable constante (sin inicializar)
	
	// El constructor inicializ
	public Incremento( int valorIncremento ) 
	{
		
		INCREMENTO = valorIncremento; // Inicializa la variable constante (una vez)
		
	} // Fin del constructor Incremento
	
	public void sumarIncrementoATotal() 
	{
		
		total += INCREMENTO;
		
	} // Fin del m�todo sumarIncrementoATotal
	
} // Fin de la clase Incremento

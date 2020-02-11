package miembrosStatic;

public class Empleado 
{
	
	private String primerNombre;
	private String apellidoPaterno;
	private static int cuenta = 0; // Número de objetos en memoria
	
	// Inicializa empleado, suma 1 a la variable static cuenta e
	// imprime objeto String que indica que se llamó al constructor
	public Empleado( String nombre, String apellido ) 
	{
		
		primerNombre = nombre;
		apellidoPaterno = apellido;
		
		cuenta++; // Incrementa la variable static cuenta de empleados
		System.out.printf( "Constructor de Empleado: %s %s; cuenta = %d\n",
				primerNombre, apellidoPaterno, cuenta );
		
	} // Fin constructor Empleado
	
	// Resta 1 a la variable static cuenta cuando el recolector
	// de basura llama a finalize para borrar el objeto;
	// confirma que se llamó a finalize
	protected void finalize() 
	{
		
		cuenta--; // Decrementa la variable static cuenta de empleados
		System.out.printf("Finalizador de Empleado: %s %s; cuenta = %d\n",
				primerNombre, apellidoPaterno, cuenta );
		
	} // Fin del metodo finalize
	
	// Obtiene el primer nombre
	public String obtenerPrimerNombre() 
	{
		
		return primerNombre;
		
	} // Fin del método obtenerPrimerNombre
	
	// Obtiene el apellido paterno
	public String obtenerApellidoPaterno()
	{
		
		return apellidoPaterno;
		
	} // Fin del método obtenerApellidoPaterno
	
	// Método static para obtener el valor de la variable static cuenta
	public static int obtenerCuenta()
	{
		
		return cuenta;
		
	} // Fin del método obtenerCuenta
	
} // Fin Empleado

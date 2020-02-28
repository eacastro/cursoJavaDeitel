package herencia;

public class EmpleadoPorComision extends Object // Hacemos expl�cita la herencia con Object
{
	
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	private double ventasBrutas; 		// Ventas semanales totales
	private double tarifaComision;		// Porcentaje de comisi�n
	
	public EmpleadoPorComision( String nombre, String apellido, String nss,
			double ventas, double tarifa ) 
	{
		
		// La llamada impl�cita al constructor del objeto
		// de la superclase ocurre aqu�
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
		establecerVentasBrutas( ventas ); 	// Valida y almacena las ventas brutas
		establecerTarifaComision( tarifa ); // Valida y almacena la tarifa de comisi�n
		
	} // Fin del m�todo constructor
	
	public void establecerPrimerNombre( String nombre ) 
	{
		
		
		primerNombre = nombre;
		
	} // Fin del m�todo establecerPrimerNombre
	
	
	
	
	
	
	
} // Fin clase EmpleadoPorComision

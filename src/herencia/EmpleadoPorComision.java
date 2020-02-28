package herencia;

public class EmpleadoPorComision extends Object // Hacemos explícita la herencia con Object
{
	
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	private double ventasBrutas; 		// Ventas semanales totales
	private double tarifaComision;		// Porcentaje de comisión
	
	public EmpleadoPorComision( String nombre, String apellido, String nss,
			double ventas, double tarifa ) 
	{
		
		// La llamada implícita al constructor del objeto
		// de la superclase ocurre aquí
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
		establecerVentasBrutas( ventas ); 	// Valida y almacena las ventas brutas
		establecerTarifaComision( tarifa ); // Valida y almacena la tarifa de comisión
		
	} // Fin del método constructor
	
	public void establecerPrimerNombre( String nombre ) 
	{
		
		
		primerNombre = nombre;
		
	} // Fin del método establecerPrimerNombre
	
	
	
	
	
	
	
} // Fin clase EmpleadoPorComision

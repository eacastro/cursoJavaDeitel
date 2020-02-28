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
	
	public String obtenerPrimerNombre() 
	{
		
		return primerNombre;
		
	} // Fin del m�todo obtenerPrimerNombre
	
	public void establecerApellidoPaterno( String apellido ) 
	{
		
		apellidoPaterno = apellido;
		
	} // Fin del m�todo establecerApellidoPaterno
	
	public String obtenerApellidoPaterno()
	{
			
		return apellidoPaterno;
		
	} // Fin del m�todo obtenerApellidoPaterno
	
	public void establecerNumeroSeguroSocial( String nss )
	{
		
		numeroSeguroSocial = nss;
		
	} // Fin del m�todo establecerNumeroSeguroSocial
	
	public String obtenerNumeroSeguroSocial()
	{
		
		return numeroSeguroSocial;
		
	} // Fin del m�todo obtenerNumeroSeguroSocial
	
	public void establecerVentasBrutas( double ventas )
	{
		
		ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
		
	} // Fin del m�todo establecerVentasBrutas
	
	
	public double obtenerVentasBrutas()
	{
		
		return ventasBrutas;
		
	} // Fin del m�todo obtenerVentasBrutas
	
	public void establecerTarifaComision( double tarifa )
	{
		
		tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
		
	} // Fin del m�todo establecerTarifaComision
	
	
	public double obtenerTarifaComision()
	{
	
		return tarifaComision;
		
	} // Fin del m�todo obtenerTarifaComision
	
} // Fin clase EmpleadoPorComision

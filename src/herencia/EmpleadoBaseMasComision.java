package herencia;

public class EmpleadoBaseMasComision extends EmpleadoPorComision
{
	
	private double salarioBase; // Salario base por semana
	
	public EmpleadoBaseMasComision( String nombre, String apellido,
			String nss, double ventas, double tarifa, double salario )
	{
		
		super( nombre, apellido, nss, ventas, tarifa );
		establecerSalarioBase( salario );
		
	} // Fin del m�todo constructor
	
	public void establecerSalarioBase( double salario )
	{
		
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
		
	} // Fin del m�todo establecerSalarioBase
	
	
	
	
} // Fin de la clase EmpleadoBaseMasComision

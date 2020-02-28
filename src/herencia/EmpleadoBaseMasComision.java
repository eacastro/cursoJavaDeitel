package herencia;

public class EmpleadoBaseMasComision extends EmpleadoPorComision
{
	
	private double salarioBase; // Salario base por semana
	
	public EmpleadoBaseMasComision( String nombre, String apellido,
			String nss, double ventas, double tarifa, double salario )
	{
		
		super( nombre, apellido, nss, ventas, tarifa );
		establecerSalarioBase( salario );
		
	} // Fin del método constructor
	
	
	
	
} // Fin de la clase EmpleadoBaseMasComision

package ejercicio9_3;
import herencia.EmpleadoPorComision;
/*
 * Muchos programas escritos con herencia podrían escribirse mediante
 * la composición, y viceversa. Vuelva a escribir las clases EmpleadoBaseMasComision
 * de la jerarquía EmpleadoPorComision-EmpleadoBaseMasComision para usar la
 * composición en vez de la herencia *
 */
public class EmpleadoBaseMasComision 
{
	
	private double salarioBase; // Salario base por semana
	private EmpleadoPorComision empleado; // Composicion
	
	// Método constructor
	public EmpleadoBaseMasComision( String nombre, String apellido,
			String nss, double ventas, double tarifa, double salario )
	{
		
		salarioBase = salario;
		empleado = new EmpleadoPorComision( )
		
	} // Fin del método constructor
	
	public void establecerSalarioBase( double salario )
	{
		
		// Valida que el salario sea positivo
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
		
	} // Fin del método establecerSalarioBase
	
} // Fin de la clase EmpleadoBaseMasComision

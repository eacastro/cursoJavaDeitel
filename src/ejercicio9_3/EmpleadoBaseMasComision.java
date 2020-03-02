package ejercicio9_3;
import herencia.EmpleadoPorComision;
/*
 * Muchos programas escritos con herencia podr�an escribirse mediante
 * la composici�n, y viceversa. Vuelva a escribir las clases EmpleadoBaseMasComision
 * de la jerarqu�a EmpleadoPorComision-EmpleadoBaseMasComision para usar la
 * composici�n en vez de la herencia *
 */
public class EmpleadoBaseMasComision 
{
	
	private double salarioBase; // Salario base por semana
	/*	La variable de instancia empleado la dejo con acceso
	 * 	p�blico ya que sus propias variables de instancia
	 * 	est�n encapsuladas y ocultadas al c�digo cliente.
	 * */
	public EmpleadoPorComision empleado; // Aplicamos la composicion aqu�
	
	// M�todo constructor
	public EmpleadoBaseMasComision( String nombre, String apellido,
			String nss, double ventas, double tarifa, double salario )
	{
		
		salarioBase = salario;
		empleado = new EmpleadoPorComision( nombre, apellido, nss,
				ventas, salario );
		
	} // Fin del m�todo constructor
	
	public void establecerSalarioBase( double salario )
	{
		
		// Valida que el salario sea positivo
		salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
		
	} // Fin del m�todo establecerSalarioBase
	
} // Fin de la clase EmpleadoBaseMasComision

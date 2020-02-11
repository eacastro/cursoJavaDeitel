package miembrosStatic;

public class PruebaEmpleado 
{

	public static void main( String args[] )
	{
		
		// Muestra que la cuenta es 0 antes de crear Empleados
		System.out.printf( "Empleados antes de instanciar: %d\n", 
				Empleado.obtenerCuenta() );
		
		// Crea dos Empleados; la cuenta debe ser 2
		Empleado e1 = new Empleado( "Susan", "Baker" );
		Empleado e2 = new Empleado( "Bob", "Blue" );
		
		// Muestra que la cuenta es 2 después de crear dos Empleados
		System.out.println( "\nEmpleados después de instanciar: " );
		System.out.printf( "mediante e1.obtenerCuenta(): %d\n", e1.obtenerCuenta() );
		System.out.printf( "mediante e2.obtenerCuenta(): %d\n", e2.obtenerCuenta() );
		System.out.printf( "mediante Empleado.obtenerCuenta(): %d\n", 
				Empleado.obtenerCuenta() );
		
		// obtiene los nombres de los Empleados
		System.out.println( "\nEmpleados después de instanciar: " );
		System.out.printf( "mediante e1.obtenerCuenta(): %d\n", e1.obtenerCuenta() );
		System.out.printf( "mediante e2.obtenerCuenta(): %d\n", e2.obtenerCuenta() );
		System.out.printf( "mediante Empleado.obtenerCuenta(): %d\n", 
				Empleado.obtenerCuenta() );
		
	} // Fin main
	
} // Fin PruebaEmpleado

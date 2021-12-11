package modelomundo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
//Atributos
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private int genero;
	private String imagen;
	private double salario;
	private Fecha fechaNacimiento;
	private Fecha fechaIngreso;
	
	
	
	//M�todo constructor
	
	public Empleado () {
		nombreEmpleado ="";
		apellidoEmpleado = "";
		genero = 0;
		imagen = "";
		salario = 0.0;
		fechaNacimiento = new Fecha();
		fechaIngreso = new Fecha();
		
		
		
	}
	
	// M�todo con parametros
	
	public Empleado(String pNombreEmpleado, String pApellidoEmpleado, int pGenero, String pImagen, double pSalario,Fecha pFechaN,Fecha pFechaI) {
		nombreEmpleado = pNombreEmpleado;
		apellidoEmpleado = pApellidoEmpleado;
		genero = pGenero;
		imagen = pImagen;
		salario = pSalario;
		fechaNacimiento=pFechaN;
		fechaIngreso = pFechaI;
	
	}
	
	//M�todos analizadores(permiten obtene o modificar la informaci�n de los atributos)
	//Getters (Obtener) // Setters(Cambiar o modificar)
	
	public String getNombre() {
		return nombreEmpleado;
		

	}

	public String getApellido() {
		return apellidoEmpleado;
		

	}
	public int getGenero() {
		return genero;
		

	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
		

	}
	public Fecha getFechaIngreso() {
		return fechaIngreso;
		

	}
	
	public String getImagen() {
		return imagen;
		

	}
	public double getSalario() {
		return salario;
		

	}
	
	public Fecha getFechaActual() {
		
	   GregorianCalendar gc = new GregorianCalendar();
	   
	   int dia = gc.get(Calendar.DAY_OF_MONTH);
	   int mes = gc.get(Calendar.MONTH)+1;
	   int anio =gc.get(Calendar.YEAR);
	   
	   Fecha fechaActual = new Fecha (dia, mes , anio);
	   return fechaActual;
	   
	   
	}
	
	//M�todo Setters
	
	public void setEmpleado(String pNombreEmpleado, String pApellidoEmpleado, int pGenero, String pImagen, double pSalario) {
		nombreEmpleado = pNombreEmpleado;
		apellidoEmpleado = pApellidoEmpleado;
		genero = pGenero;
		imagen = pImagen;
		salario = pSalario;
		
	}
	
	public void setSalario( double pSalario) {
		
		salario =pSalario;
		
		
	}
	
	//M�todos funcionales
	public int calcularAntiguedad() {
		int antiguedad= 0;
		antiguedad = fechaIngreso.darDiferenciaEnMeses(getFechaActual())/12;

		return antiguedad;
	}
	
	//M�todo funcional calcula la edad del empleado en a�os
	
	public int calcularEdad() {
		int edad=0;
		edad=fechaIngreso.darDiferenciaEnMeses(getFechaActual())/12;
		return edad;
	}
	//M�todo que calcula las prestaciones del empleado
	public double calcularPrestaciones() {
		return calcularAntiguedad()*getSalario()/12;
		
		
	}
	
	//M�todo que permite visualizar la informaci�n del codigo
	public void mostrarDatos() {
	System.out.println("\n Informacion del Cliente");
	System.out.println("Nombre: "+nombreEmpleado);
	System.out.println("Apellido: "+apellidoEmpleado);
	System.out.println("Genero: "+genero);
	System.out.println("Salario: "+salario);
	
	}
	
	
	
	
	
	
	
	
	
	

}

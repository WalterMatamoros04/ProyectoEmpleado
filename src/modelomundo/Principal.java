package modelomundo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//TODO Auto- generated method stud

		Empleado empleado1= null;
		//Declarar variables para los datos del empleado
		String nombreEmple;
		String apellidoEmple;
		int genero;
		String imagen;
		double salario;
		int dia , mes , anio;
		
		Fecha fechaNac;
		Fecha fechaIngreso;
		
		Scanner leer =new Scanner(System.in);
		int opcionM =0;


do {
		System.out.println("\nOpciones del Menu");
		System.out.println("1.Ingresar Datos del Empleado");
		System.out.println("2.Calcular la edad del empleado");
		System.out.println("3.Calcular la antiguedad del empleado en la empresa");
		System.out.println("4.Calcular las prestaciones del empleado");
		System.out.println("5.Visualizar la informacion del empleado");
		System.out.println("6.Salir");
		System.out.println("Ingrese una de las Opciones Anteriores");
		opcionM = leer.nextInt();

		switch(opcionM) {
		case 1:
			System.out.println("\nBienvenido");
			System.out.println("Ingrese los datos del Empleado");
			System.out.println("Ingrese su Nombre");
			nombreEmple= leer.next();
			System.out.println("Ingrese su Apellido");
			apellidoEmple= leer.next();
			System.out.println("Ingrese su Genero  1 Masculiono o 2 Femenino");
			genero =leer.nextInt();
			System.out.println("Ingrese su Salario en Dolares");
			salario=leer.nextDouble();
			System.out.println("Ingrese su Fecha de Nacimiento en orden DD/MM/AA");
			dia=leer.nextInt();
			mes=leer.nextInt();
			anio=leer.nextInt();
			System.out.println("Ingrese su Fecha de Ingreso a la empresa en orden DD/MM/AA");
			dia=leer.nextInt();
			mes=leer.nextInt();
			anio=leer.nextInt();
			
			empleado1=new Empleado(nombreEmple, apellidoEmple, genero,"", salario, fechaNac, fechaIngreso);
			break;

		case 2:

			System.out.println("Calculo de la edad del Empleado");
			System.out.println("La edad del empleado corresponde a:"+empleado1.calcularEdad());
			break;

		case 3:

			System.out.println("Calculo del tiempo de antiguedad del empleado");
			System.out.println("El tiempo de antiguedad corresponde a:"+empleado1.calcularAntiguedad());
			break;

		case 4:
			System.out.println("Calculo del las prestaciones del empleado");
			System.out.println("las  prestaciones corresponde a:"+empleado1.calcularPrestaciones());
			break;

		case 5:
			System.out.println("Mostrar la informacion del Empleado");
			empleado1.mostrarDatos();
			break;
		case 6:
			System.out.println("Gracias vuelve Pronto");
			break;
			

		default:
			System.out.println("Opcion Incorrecta");




		}

	}while(opcionM!=6);
}
}

package CIR;

public class Principal {

	public static void main(String[] args) {
		//creamos el objeto estudiante 
		Estudiante Estudiante1 = new Estudiante("Pedro", "Lopez puerta", "01-01-2000");
		
		
		//creamos los objetos Asignaturas con los datos de los atributos de asignaturas
		Asigantura Asignatura1 = new Asigantura("PRG", 8, "3-A");
		Asigantura Asignatura2 = new Asigantura("BBDD", 3, "3-B");
		Asigantura Asignatura3 = new Asigantura("Entornos", 6, "3-A");
		Asigantura Asignatura4 = new Asigantura("IPP", 9, "3-B");
		Asigantura Asignatura5 = new Asigantura("MATES", 8, "3-B");
		
		//mostramos el el metodo mostrar datos hecho en Estudiante 
		System.out.println(Estudiante1.mostrarDatos());
		
		System.out.println(Asignatura1.mostrarDatosAsig());
		System.out.println(Asignatura2.mostrarDatosAsig());
		System.out.println(Asignatura3.mostrarDatosAsig());
		System.out.println(Asignatura4.mostrarDatosAsig());
		System.out.println(Asignatura5.mostrarDatosAsig());
		System.out.println(Asignatura1.mostrarDatosAsig());
		
		
		
		System.out.println();

	}

}

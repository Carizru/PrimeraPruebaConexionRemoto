package CIR;

public class Estudiante {
	private String nombre;
	private String apellidos;
	private String fechaNac;
	
	//Creamos los atributos de  el estudainte que pide  en el enunciado
	
	
	
	public Estudiante(String nombre, String apellidos, String fechaNac) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		
		
		//generamos el constructor
		
	}
	
	
	public  String mostrarDatos() {
		
		return "nombre: " + nombre  + "apellidos: " + apellidos + "fecha de nacimiento: " + fechaNac; 
		 
		
		//Creamos un metodo para mostrar los datos del usuarios
		
	}
	public int notaMedia(int nota) {
		int media;
		int asignatura = 0;
		
		media = nota/asignatura;
		
		return media;
		
		//Hago la media de la nota del estudainte
		
	}
	public void matricularse() {
		
	}
	
	
}
	
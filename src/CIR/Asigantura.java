package CIR;

public class Asigantura {
	private String denominacion;
	private int nota;
	private String curso;
	
	public Asigantura(String denominacion, int nota, String curso) {
		
		this.denominacion = denominacion;
		this.nota = nota;
		this.curso= curso;
		
		
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
		
		
		//Generamos getters y setters de los atributos Asignatura
	}
public  String mostrarDatosAsig() {
		
		return "Asignatura: " + denominacion  + "nota: " + nota + "curso: " + curso; 
		 
		
		//Creamos un metodo para mostrar los datos del usuarios
		
	}

}

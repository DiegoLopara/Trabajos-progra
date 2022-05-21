package Video;

public class Cliente {

	private String nombre = "";
	private String apellido = "";
	private int numSocio = 0;
	private String dni;
	private boolean alta = false;
	
	
	
	
//Constructor
public Cliente(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numSocio = numSocio;
		this.dni = dni;
	}









//Constructor vacio para crear clientes
	public Cliente() {
	// TODO Auto-generated constructor stub
}










	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
	public boolean isAlta() {
		return alta;
	}
	public void setAlta(boolean alta) {
		this.alta = alta;
	}
	public int getNumSocio() {
		return numSocio;
	}
	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}









	public void infoCliente() {
		
		System.out.println(" El cliente que se ha creado es el numero: " + numSocio + ", " + this.nombre + " " + this.apellido);
		
	}
	
}

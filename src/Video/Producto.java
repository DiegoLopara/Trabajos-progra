package Video;

public class Producto {

	private String titulo = "";
	private int codigo = 0;
	private double precio = 0;
	
	
	

	
	
	
	
	
//Constructor
	public Producto(String titulo) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.precio = precio;
	}









	
	
	
//getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
//De esta manera muestro todos los métodos info cuando llamo desde producto
//polimorfismo
	public void info() {
		
	}
	
	
	
	
	
}

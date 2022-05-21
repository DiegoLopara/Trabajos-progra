package Video;

public class Pelicula extends Producto{

	private int tipoPeli;
	static int codigoPeli = 10000;
	private int diasRestantes = 0;
	private int duracionAlquiler = 0;
	private boolean alquilado = false;
	private int cliente;
	static int novedad = 2;
	static int semiNovedad = 1;
	static double antiguedad = 0.5;
	
	
	
	
	
	
	
	
	
	
	
	
//Constructor
	public Pelicula(String titulo, int tipoPeli) {
		super(titulo);
		//Para saber de que tipo es cada pelicula
		if (tipoPeli==1) {
			
			super.setPrecio(3);
			
			this.duracionAlquiler = 1;
			
		}else if (tipoPeli==2) {
			
			super.setPrecio(2);
			
			this.duracionAlquiler=2;
			
		}else if (tipoPeli==3) {
			
			super.setPrecio(1);
			
			this.duracionAlquiler=4;
			
		}
		//Asigna un código a cada pelicula
		super.setCodigo(codigoPeli);
		this.tipoPeli = tipoPeli;
		codigoPeli++;
	}
	
	
	
	
	
	
	
	
	

	
	
//getters y setters
	public int getTipoPeli() {
		return tipoPeli;
	}
	public void setTipoPeli(int tipoPeli) {
		this.tipoPeli = tipoPeli;
	}
	
	public int getDiasRestantes() {
		return diasRestantes;
	}
	public void setDiasRestantes(int diasRestantes) {
		this.diasRestantes = diasRestantes;
	}
	public int getDuracionAlquiler() {
		return duracionAlquiler;
	}
	public void setDuracionAlquiler(int duracionAlquiler) {
		this.duracionAlquiler = duracionAlquiler;
	}
	public boolean isAlquilado() {
		return alquilado;
	}
	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}	
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}












	//Metodo para mostrar la informacion de la pelicula
	public void info() {
		
		System.out.println("Titulo: " + super.getTitulo() + " Tipo: " + this.tipoPeli + " Precio: " + super.getPrecio() + " Codigo: " + super.getCodigo());
	}
//Metodo para mostrar la informacion del alquiler de la pelicula
	public void infoAlquiler() {
		
		System.out.println("Titulo: " + super.getTitulo() + " Codigo: " + super.getCodigo() + " Dias que quedan para que se acabe el alquiler: Hoy y " + (this.diasRestantes-1) + " dias");
	}
//MEtodo para alquilar, si esta  alquilado, los dias restantes seran igual a los dias de duracion del alquiler
	public void alquilar() {
		
		this.alquilado = true;
		this.diasRestantes = this.duracionAlquiler;
	}
	
	

	
	
	
	
	
	
	
}

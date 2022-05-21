package Video;

public class CD extends Producto{

	private String artista = "";
	static int codigoCD = 20000;
	
	
	
	
	
	
	
	
	
	
	
	
	
//Constructor
	public CD(String titulo, String artista, double precio) {
		super(titulo);
		//De esta manera asigno un titulo, un codigo, un precio y un artista a cada cd
		super.setTitulo(titulo);
		super.setCodigo(codigoCD);
		super.setPrecio(precio);
		this.setArtista(artista);
		codigoCD++;
	}













	
	
	
	
	
//getters y setters
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	
//Metodo para mostrar la informacion de los cds	
	public void info() {
		
		System.out.println("Titulo: " + super.getTitulo() + " Artista " + this.artista + " Precio: " + super.getPrecio() + " Codigo: " + super.getCodigo());
	}
	
	
	
	
}

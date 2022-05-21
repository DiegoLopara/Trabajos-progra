package Video;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static int dia = 1;
//Utilizado para guardar los datos de las ganancias	
	static double gananciasCD = 0;
//Utilizado para guardar los datos de las ganancias		
	static double gananciasPeliculas = 0;
	
	static double gananciasRetraso = 0;
	
	static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	
	static ArrayList<CD> cds = new ArrayList<CD>();
	
	static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
    static ArrayList<Pelicula> peliculasAlquiladasTotales = new ArrayList<Pelicula>();
    
    static ArrayList<Pelicula> peliculasDisponibles = new ArrayList<Pelicula>();
    
	//sc strings
	static Scanner sc = new Scanner(System.in);
	//ln numeros
	static Scanner ln = new Scanner(System.in);
	
	static int inCodCliente = 100;
	
	static int codCliente = 0;
	
	public static void main(String[] args) {
	
//Introducir peliculas
		
		peliculas.add(new Pelicula("Conan el barbaro", 3));
		peliculas.add(new Pelicula("El rascacielos", 1));
		peliculas.add(new Pelicula("Top gun", 3));
		peliculas.add(new Pelicula("Mercury rising", 3));
		peliculas.add(new Pelicula("El dia de mañana", 2));
		peliculas.add(new Pelicula("Nadie", 1));
		peliculas.add(new Pelicula("Escape de los Angeles", 3));
		peliculas.add(new Pelicula("Los vengadores", 2));
		peliculas.add(new Pelicula("The batman", 1));
		peliculas.add(new Pelicula("Rebeca", 3));
		peliculas.add(new Pelicula("Pulp fiction", 3));
		peliculas.add(new Pelicula("La leyenda del zorro", 2));
		peliculas.add(new Pelicula("El padrino", 3));
		peliculas.add(new Pelicula("Juego de honor", 2));
		
//Introducir cds
		
		cds.add(new CD("Butchered at birth", "Cannibal corpse", 13.75));
		cds.add(new CD("Chaos A.D.", "Sepultura", 8.25));
		cds.add(new CD("Course of Osiris", "Testament", 11.3));
		cds.add(new CD("Extreme power of metal", "Dragonforce", 12.89));
		cds.add(new CD("Omega", "Epica", 14.67));
		cds.add(new CD("To bathe from the throath of cowardice", "V.I.T.R.I.O.L", 7.89));
		cds.add(new CD("Rammstein", "Rammstein", 15.35));
		cds.add(new CD("Ultu Ulla", "Rings of saturn", 8.45));
		
		
		int opcion1 = 0;
		
		String entrada = "";
		
		double opcion2 = 0;
		
		while (true) {
			
			System.out.println("MENU: DIA " + dia);
			
			System.out.println("\n1.- Introducir nuevo producto ");
			System.out.println("\n2.- Dar de alta cliente ");
			System.out.println("\n3.- Eliminar producto ");
			System.out.println("\n4.- Ver listado de peliculas ");
			System.out.println("\n5.- Ver listado de CDs ");
			System.out.println("\n6.- Alquilar pelicula ");
			System.out.println("\n7.- Devolver peliculas ");
			System.out.println("\n8.- Vender disco ");
			System.out.println("\n9.- Ver peliculas en alquiler ");
			System.out.println("\n10.- Ver retraso ");
			System.out.println("\n11.- Buscar cliente ");
			System.out.println("\n12.- Ver ganancias ");
			System.out.println("\n13.- Pasar al dia siguiente ");
			System.out.println("\n14.- Salir ");
			
//Menu a prueba de error			
			do {
				
				do {
					
				System.out.println("Elija una opcion (1-14)");
				
				entrada = sc.nextLine();
				
				}while(!isNumeric(entrada));
				
				opcion1 = Integer.valueOf(entrada);
				
				if (opcion1<1 || opcion1>14) {
					
					System.out.println("Numero fuera de rango");
					
				}
			} while (opcion1<1 || opcion1>14);
			
			System.out.println("Has introducido el numero " + opcion1);
			
			switch(opcion1) {
			
			case 1:
				
				nuevoProducto();
					
			break;
			
			case 2:
				
				darAltaCliente();
					
			break;
			
			case 3:
				
				eliminarProducto();
				
			break;
			
			case 4:
				listaPeliculas();
				
			break;
			
			case 5:
				
				listaCDS();
				
			break;
			
			case 6:
				
				alquilarPelicula();
				
			break;
			
			case 7:
				
				devolverPelicula();
				
			break;
			
			case 8:
				
				venderDisco();
				
			break;
			
			case 9:
				
				verPelisAlquiler();
				
			break;
			
			case 10:
				
	//			verRetraso();
				
			break;
			
			case 11:
				
//				buscarCliente();
				
			break;
			
			case 12:
				
				verGanancias();
				
			break;
			
			case 13:
				
				pasarDia();
				
			break;
			
			case 14:
				
				System.out.println("\nFin del programa");
				
				sc.nextLine();
				
			default:
				
				System.out.println("Ingresa numero valido");
				
				break;
			}
			
			
			
			
			
			
			
			
			
		}
		
	}
/*Le pido al cliente mediante un menú switch case, que
 * elija para introducir un nuevo producto, que puede ser 
 * o una nueva pelicula o un nuevo cd, o puede volver al menu
 * principal solo pulsando el numero 3, todo esto lo controlo 
 * con un scanner de tipo numerico, y con un scanner de tipo
 * texto para volver al manu, y en el tres coloco un return
 * para que me saque de esta opcion del menu principal
 * , los metodos generados son los creados al final del
 * programa*/	
	private static void nuevoProducto() {
		
		while (true) {
			
			System.out.println("\nPulse (1, 2 o 3): 1.- Nueva pelicula., 2.-Nuevo CD., 3.- Volver al menu principal");
			
			switch(ln.nextInt()) {
			
			case 1:
				
				nuevaPelicula();
				
				System.out.println("Pulse enter para volver al menu principal");
				
				sc.nextLine();
			
			break;
			
			case 2:
				
				nuevoCD();
				
				System.out.println("Pulse enter para volver al menu principal");
				
				sc.nextLine();
				
			break;
			
			case 3:
				
				return;
			
			default:
				
				System.out.println("Introduce un numero valido");
				
			break;
			}
			
		}
	}
	
	public static void darAltaCliente() {
		
				
		Cliente cliente = new Cliente();
		
		System.out.println(" Introduzca el nombre del nuevo cliente ");
			
		String nombre = sc.nextLine();
		
		cliente.setNombre(nombre);
				
		System.out.println(" Introduzca los apellidos del nuevo cliente: ");
				
		String apellido = sc.nextLine();
		
		cliente.setApellido(apellido);
		
		System.out.println(" Introduzca el dni del cliente: ");
		
		String dni = sc.nextLine();
		
		cliente.setDni(dni);
		
		cliente.setNumSocio(inCodCliente + codCliente);
			
		listaClientes.add(cliente);
		
		codCliente++;
		
		System.out.println(" Has creado el cliente ");
		
		cliente.infoCliente();
		
		System.out.println("\nPulse enter para volver al menu principal");
			
		sc.nextLine();
		
	}
	
/*Metodo por el cual creo un ArrayList denominado productos, en el que
 * introduzco todas las peliculas, y todos los cds, posteriormente
 * se observa que introduzco el tamaño que ocupa este array
 * y lo muestro con cantidad de productos, despues muestro todos los productos 
 * que tengo, tanto peliculas como cds mediante un for que me recorre todos
 * los productos, y un metodo info, creado con una serie de descripciiones del 
 * producto que muestra en la pantalla, todo esto preguntando antes que seleccione
 * el tipo de producto que quiero eliminar, despues de mostrarlo, empezamos con
 * la seleccion de lo que queremos eliminar, esto lo escribimos en pantalla mediante
 * un scanner de tipo numerico y restandole uno porque es un array, luego preguntamos
 * que si desea eliminar, el producto con su titulo y su codigo, antes generado, y aqui 
 * hay que elegir 1 si quieres y 2 si no quieres, esto se introduce mediante un scanner
 * de tipo numerico, si se elige la opcion 1, en el caso de que el producto sea pelicula,
 * para eso utilizo el instanceof, realiza la eliminación, mediante el metodo remove,
 * y lo mismo con cd, pero restandole la cantidad de peliculas*/
	
	private static void eliminarProducto() {
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		productos.addAll(peliculas);
		
		productos.addAll(cds);
		
		System.out.println("Cantidad de productos= " + productos.size());
		
		System.out.println("\nSelecciona el producto que deseas eliminar: \nPeliculas: ");
		
		for (int i = 0; i < productos.size(); i++) {
			
			if (i==peliculas.size()) {
				
				System.out.println("\nDiscos");
			
			}
				productos.get(i).info();
		}
		
		System.out.println("\nSeleccione lo que desee eliminar");
		
		int eleccion;
		
		eleccion = ln.nextInt() -1;
		
		System.out.println("Desea eliminar " + productos.get(eleccion).getTitulo() + " " + productos.get(eleccion).getCodigo() + " 1.-Si, 2.- No");
		
			
		
		if (ln.nextInt()==1) {
			
			if (productos.get(eleccion) instanceof Pelicula) {
				
				peliculas.remove(eleccion);
				
				System.out.println("Producto eliminado con exito");
				
			}else {
				
				cds.remove(eleccion-peliculas.size());
				
				System.out.println("Producto eliminado con exito");
				
			}
		}
		
		System.out.println("Pulse enter para volver al menu principal");
		
		sc.nextLine();
	}
	
/*Metodo por el cual muestro las peliculas, recorriendome con 
 * un for each el ArrayList de peliculas, y mostrando la informacion 
 * de la pelicula mediante un metodo denominado info creado en su clase 
 * si el metodo funciona como es el caso se mostraran todas las peliculas 
 * menos las eliminadas anteriormente.*/	
	
	private static void listaPeliculas() {
		
		System.out.println("\nListado de peliculas: ");
		
		for (Pelicula pelicula : peliculas) {
			
			pelicula.info();
			
		}
		
		System.out.println("Pulse enter para volver al menu principal");
		
		sc.nextLine();
		
	}
	
/*Metodo por el cual muestro los cds, recorriendome con 
* un for each el ArrayList de cds, y mostrando la informacion 
* del cd mediante un metodo denominado info creado en su clase, 
* si el metodo funciona como es el caso se mostraran todos los cds 
* menos los eliminados anteriormente.*/	
	
	private static void listaCDS() {
		
		System.out.println("\nListado de CDS: ");
		
		for (CD cd : cds) {
			
			cd.info();
			
		}
		
		System.out.println("Pulse enter para volver al menu principal");
		
		sc.nextLine();
		
	}
	
/*Metodo por el cual creo un ArrayList denominado peliculasDisponibles, en el cual lo que hago
 * es un for each de las peliculas y digo que si esa pelicula no esta alquilada, la introduzca
 * en el ArrayList peliculasDisponibles, despues imprimo en pantalla cual es la pelicula
 * que desea alquilar, y digo que la peliculas que quedan sin alquilar son las que he introducido 
 * anteriormente en peliculasDisponibles, y las muestro recorriendo la longitud de 
 * peliculasDisponibles con un for, y llamando al metodo que introduce toda la informacion
 * de las peliculas que se denomina info, mas adelante creo un scanner de tipo numerico
 * y le resto 1 debido a que es un array, y comienzo con el alquiler, preguntando que si
 * desea alquilar las peliculas que anteriormente se ha demostrado que estan sin 
 * alquilar y su titulo y digo que si pulsa el numero 1 sera que si y el numero 2 sera que no, si dice
 * que si, llamara al ArrayList peliculasDisponibles, cogera la pelicula elegida y llamara al metodo
 * alquilar, que la pondra como alquilada, posteriormente nos saldra la frase que nos dira la pelicula 
 * que hemos alquilado con su titulo y el dia del alquiler mas los dias restantes que quedan para
 * que finalice el alquiler, por ultimo lo que hago es introducir en la estatica gananciasPeliculas el
 * precio que he ganado con el alquiler, para luego poder usarlo en el metodo posterior */
	
	private static void alquilarPelicula() {
		
		int cliente = 0;
		
		String linea;
		
		for (Pelicula pelicula : peliculas) {
			
			if (pelicula.isAlquilado()==false) {
				
				peliculasDisponibles.add(pelicula);
				
			}
		}
		
		System.out.println(" ¿Que cliente va a alquilar? ");
		
		
		
		for (int i = 0; i < listaClientes.size(); i++) {
			
			System.out.println((i+1)+ ".- " + listaClientes.get(i).getNombre());
			
		}
		
		cliente = ln.nextInt();
		
		System.out.println("\nSelecciona la pelicula que deseas alquilar:  Quedan sin alquilar " + peliculasDisponibles.size());
		
		for (int i = 0; i < peliculasDisponibles.size(); i++) {
			
			peliculasDisponibles.get(i).info();
			
		}
	
		System.out.println(" que pelicula desea alquilar");	
		
		int pelicula;
		
		pelicula = ln.nextInt() - 1;
		
		System.out.println("Deseas alquilar " + peliculasDisponibles.get(pelicula).getTitulo() + " 1.- Si, 2.- No");
		
		if (ln.nextInt()==1) {
			
			peliculasDisponibles.get(pelicula).setCliente(cliente);
			
			peliculasDisponibles.get(pelicula).alquilar();
			
			System.out.println("el cliente " + cliente + " Ha alquilado la pelicula " + peliculasDisponibles.get(pelicula).getTitulo() + " hasta el dia " + (dia + peliculasDisponibles.get(pelicula).getDiasRestantes()-1));
			
			gananciasPeliculas += peliculasDisponibles.get(pelicula).getPrecio();
		
		}
		
		System.out.println("Pulse enter para volver al menu principal");
		
		sc.nextLine();
		
	}
	
	public static void devolverPelicula() {
		
		for (Pelicula pelicula : peliculas) {
			
			if (pelicula.isAlquilado()==true) {
				
				peliculasAlquiladasTotales.add(pelicula);
				
			}
		}
		
		System.out.println("\nEstas son las peliculas que están alquiladas actualmente");
		
		for (int i = 0; i < peliculasAlquiladasTotales.size(); i++) {
			
			System.out.println((i+1) + " ");
			
			peliculasAlquiladasTotales.get(i).infoAlquiler();
			
		}
		
		System.out.println("\n¿Que pelicula se va a devolver?: ");
		
		for (int i = 0; i < peliculasAlquiladasTotales.size(); i++) {
			
			System.out.println((i+1) + ".- " + peliculasAlquiladasTotales.get(i).getTitulo());
		
		}
		
		int eleccion = ln.nextInt();
		
		if (peliculasAlquiladasTotales.get(eleccion).getDuracionAlquiler() > -1) {
			
			if (peliculasAlquiladasTotales.get(eleccion).getTipoPeli() == 1) {
				
				Pelicula auxAnt = peliculasAlquiladasTotales.get(eleccion);
				
				auxAnt.setDuracionAlquiler(1);
				
				peliculasDisponibles.add(auxAnt);
				
				for (int i = 0; i < peliculas.size(); i++) {
					
					if (peliculas.get(i) == peliculasAlquiladasTotales.get(i)) {
						
						peliculas.remove(i);
						
					}
				}
				
				peliculasAlquiladasTotales.remove(eleccion);
				
				System.out.println("\nLa pelicula se ha devuelto correctamente y se puede volver a alquilar");
				
			}else if (peliculasAlquiladasTotales.get(eleccion).getTipoPeli() == 2) {
				
				Pelicula auxNov = peliculasAlquiladasTotales.get(eleccion);
				
				auxNov.setDuracionAlquiler(2);
				
				peliculasDisponibles.add(auxNov);
				
				peliculasAlquiladasTotales.remove(eleccion);
				
				System.out.println("\nLa pelicula se ha devuelto correctamente y se puede volver a alquilar");
				
			}else if (peliculasAlquiladasTotales.get(eleccion).getTipoPeli() == 3) {
				
				Pelicula auxSemi = peliculasAlquiladasTotales.get(eleccion);
				
				auxSemi.setDuracionAlquiler(4);
				
				peliculasDisponibles.add(auxSemi);
				
				peliculasAlquiladasTotales.remove(eleccion);
				
				System.out.println("\nLa pelicula se ha devuelto correctamente y se puede volver a alquilar");
			}
			
		}else if (peliculasAlquiladasTotales.get(eleccion).getDuracionAlquiler() < 0) {
			
			
		}
	}
/*Metodo por el cual pregunto que seleccione el disco que se desea vender, posteriormente
 * recorro con un for el ArrayList de cds, y muestro el nombre de todos con el metodo
 * info creado en su clase correspondiente, despues creo un scanner de tipo numerico
 * y le resto 1 por ser un array despues hago la pregunta de si desea vender el disco
 * con su titulo del artista, con el nombre del artista, y por el precio que tenga el disco
 * y posteriormente tiene para elegir 1 como si, y 2 como no, si elige el 1, se imprimira
 * que se ha vendido el disco + el titulo del disco, por el precio del disco, lo siguiente que hago
 * es introducir en la estatica gananciasCd, el precio que he obtenido de vender los discos
 * que posteriormente utilizare en metodos posteriores, y lo ultimo que hago es utilizar el metodo remove
 * para eliminarel disco elegido mediante scanner, de los cds, de tal manera que al estar ya vendido
 * no sale impreso en pantalla*/
	
	private static void venderDisco() {
		
		System.out.println("\nSeleccione el disco que desea vender: ");
		
		for (int i = 0; i < cds.size(); i++) {
			
			cds.get(i).info();
			
		}
		
		int elegirDisco;
		
		elegirDisco = ln.nextInt()-1;
		
		System.out.println("Deseas vender el disco " + cds.get(elegirDisco).getTitulo() + " del artista " + cds.get(elegirDisco).getArtista() + " por la cantidad de " + cds.get(elegirDisco).getPrecio() + " euros 1.- Si, 2.- No");
		
		if (ln.nextInt()==1) {
			
			System.out.println("Se ha vendido el disco " + cds.get(elegirDisco).getTitulo() + " por el precio de " + cds.get(elegirDisco).getPrecio() + " euros");
			
			gananciasCD += cds.get(elegirDisco).getPrecio();
			
			cds.remove(elegirDisco);
			
		}
		
		System.out.println("Pulse enter para volver al menu principal");
		
		sc.nextLine();
		
	}
	
/*Metodo por el cual genero un ArrayList denominado peliculasAlquiladasTotales, despues
 * recorro con un for each el ArrayList de peliculas y digo que si la pelicula esta 
 * alquilada la inroduzca en el ArrayList peliculasAlquiladasTotales, despues, imprimo
 * en pantalla esta son las peliculas que estan alquiladas y recorro el ArrayList
 * peliculasAlquiladasTotales con un for introduciendole un numero y llamando
 * al metodo infoAlquiler, que nos mostrara informacion detallada de las peliculas
 * alquiladas*/
	
	private static void verPelisAlquiler() {
		
		for (Pelicula pelicula : peliculas) {
			
			if (pelicula.isAlquilado()==true) {
				
				peliculasAlquiladasTotales.add(pelicula);
				
			}
		}
		
		System.out.println("\nEstas son las peliculas que están alquiladas actualmente");
		
		for (int i = 0; i < peliculasAlquiladasTotales.size(); i++) {
			
			System.out.println((i+1) + " ");
			
			peliculasAlquiladasTotales.get(i).infoAlquiler();
			
		}
		
		System.out.println("Pulse enter para volver al menu principal");
		
		sc.nextLine();
		
	}
	
/*Metodo por el cual imprimo en pantalla las ganancias del alquilado de peliculas y
 * de la venta de cds y el total, esto lo hago recurriendo a las estaticas gananciasPeliculas
 * y gananciasCD, donde en metodos anteriores habia guardado datos de precios obtenidos
 * con las ventas y los alquileres, por ultimo para obtener las ganancias totales,
 * lo que hago es basicamente una suma de las dos estaticas, gananciasPeliculas y gananciasCD*/
	
	private static void verGanancias() {
		
		System.out.println("\nLista de ganancias totales: ");
		
		System.out.println("\nGanancias que hemos obtenido alquilando peliculas: " + gananciasPeliculas);
		System.out.println("\nGanancias que hemos obtenido por la venta de cds: " + gananciasCD);
		System.out.println("\nGanancias que hemos obtenido en total: " + (gananciasPeliculas + gananciasCD));
	
		System.out.println("\nPulse enter para volver al menu pruncipal");
		
		sc.nextLine();
		
	}

/*Metodo por el cual le sumo un dia al que ya existe utilizando la estatica dia y un ++,
 * despues introduzco un bucle while con un booleano validar que va a ser true, para
 * que cuando deje de ser true, me saque del bucle, pregunto en pantalla que si desea
 * cambiar de dia escriba si o no, y creo un scanner de tipo texto, para que si la palabra
 * escrita sea un si o una s, me saque al menu principal, y si la palabra escrita es un no 
 * o una n, siga dentro del bucle y no cambie de dia, y si no introduzco una palabra correcta,
 * me saltara un mensaje que me dira que responda si o no*/
	
	private static void pasarDia() {
		
		dia++;
		
		boolean validar = true;
		
		while (validar) {
			
		System.out.println("\n¿Desea cambiar de dia (¿si o no?)");
		
		String palabra = sc.nextLine();
		
		if (palabra.equalsIgnoreCase("si") || palabra.equalsIgnoreCase("s")) {
			
			validar = false;
			
		}else if (palabra.equalsIgnoreCase("no") || palabra.equalsIgnoreCase("n")) {
			
			validar = true;
			
		}else {
			
			System.out.println("Responde si o no");
			
		}
		
	}
		
	}
	
/*Metodo por el cual genero un ArrayList denominado nuevaPelicula
 * en el cual voy a introducir el titulo y el tipo de pelicula
 * lo primero que hago es introducir el titulo mediante un scanner
 * he introducirlo por pantalla pidiendo el tipo de pelicula que va a ser
 * esto ultimo lo controlo con un do while con un scanner de tipo
 * numerico, posteriormente pido las unidades de ese titulo que voy a 
 * alquilar lo introduzco mediante un scanner de tipo numerico tambien
 * posteriormente señalo las unidaades que se han agregado del titulo
 * introducido y genero recorriendo con un for las unidades el codigo
 * de la pelicula que he creado en su respectiva clase con una estatica*/
	
	public static ArrayList<Pelicula> nuevaPelicula() {
		
		System.out.println("\nSeleccione el titulo de la pelicula que le interesa");
		
		String titulo = sc.nextLine();
		
		System.out.println("Que tipo de pelicula es la que escoge " + titulo + "n1.- Es novedad, n2.- Es seminovedad, n3.- Es antigua" );
		
		int tipo;
		
		do {
			
			tipo = ln.nextInt();
			
		} while (tipo<1||tipo>3);
		
		System.out.println("Seleccione el numero de unidades de " + titulo + " que le gustaria agregar");
		
		int unidades = ln.nextInt();
		
		System.out.println("Se han agregado " + unidades + " unidades de " + titulo + " con los respectivos codigos ");
		
		for (int i = 0; i < unidades; i++) {
		
			System.out.println(Pelicula.codigoPeli + " ");
			
			peliculas.add(new Pelicula(titulo, tipo));
			
			
		}
		
		return peliculas;
	}
	
/*Metodo por el cual genero un ArrayList denominado nuevoCDS, en el cual
 * introduzco el titulo el artista y el precio del cd, comienzo el metodo
 * introduciendo el codigo del cd, que antes he creado mediante una 
 * estática en su respectiva clase, luego pido que seleccione el titulo que
 * le interesa escoger y lo introduzco mediante un scanner de tipo texto, imprimiendolo
 * junto con la pregunta de seleccionar el artista, que justo despues introduzco
 * mediante un scanner de tipo texto tambien, despues pido que introduzca el precio del cd
 * mediante un scanner de tipo numerico double, por si el precio lleva comas, y le pido que señale
 * el numero de unidades del titulo que quiere obtener, y las introduzco mediante un scanner de tipo 
 * numerico, por ultimo muestro la frase que muestra que he agregado las unidades de los titulos
 * escogidos y genero sus respectivos codigosmediante un for que me recorre las unidades*/
	
	public static ArrayList<CD> nuevoCD(){
		
		CD.codigoCD++;
		
		System.out.println("\nSeleccione el titulo del Cd que le interesa");
		
		String titulo = sc.nextLine();
		
		System.out.println("\nSeleccione el artista del CD " + titulo);
		
		String artista = sc.nextLine();
		
		System.out.println("\nSeleccione el precio para el CD " + titulo);
		
		double precio = ln.nextDouble();
		
		System.out.println("\nSeleccione el numero de unidades de CD " + titulo + " que quieres conseguir");
		
		int unidades = ln.nextInt();
		
		System.out.println("Se han agregado " + unidades + " unidades de " + titulo + " con los respectivos codigos ");
		
		for (int i = 0; i < unidades; i++) {
			
			System.out.println(CD.codigoCD + " ");
			
			cds.add(new CD(titulo, artista, precio));
			
		}
		
		return cds;
		
	}
/*Metodo para prueba de errores*/	
	public static boolean isNumeric(String numero) {
		
		try {
			
			int num = Integer.valueOf(numero);
			
			return true;
		
		} catch (NumberFormatException e) {
		
			System.out.println("No has introducido un numero correcto");
			
			return false;
			
		}
	}
	
	
}


import java.util.ArrayList;
import java.util.Random;

public class Jugador {

	private String nombre;
	private ArrayList<Carta>cartas;

	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Carta> getCartas() {
		return new ArrayList<>(this.cartas);
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public void borrarCartas(Carta carta) {
		cartas.remove(carta);
	}
	
	//es mayor
	//se queda con las cartas
	//tiene turno
	//tiene x cantidad de cartas

	public void agregarCarta(Carta c) {
		cartas.add(c);
		
	}
	
	public void tomarPrimerCarta(Jugador jugador1) {
		if(!cartas.isEmpty()) {
			jugador1.getPrimerCarta();
		}
	}
	
	public Carta getPrimerCarta() {
		return cartas.get(0);
	}
	
	
	public void getAtributoRandom(Carta carta) {
		Carta [] cartaAtributos = new Carta[carta.getCantidadAtributos()];
		Random rnd = new Random();
		Carta atributoSeleccionado = cartaAtributos[rnd.nextInt(cartaAtributos.length) ];
		
	}
	//ejemplo de: https://es.stackoverflow.com/questions/15827/random-y-arrays

	public int getCantidadCartas() {
		return cartas.size();
	}
	
}

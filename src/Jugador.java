import java.util.ArrayList;
import java.util.Random;

public class Jugador {

	private String nombre;
	private ArrayList<Carta>cartas;

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.cartas=new ArrayList<Carta>();
	}

	public Jugador() {
		this.nombre = nombre;
		this.cartas=new ArrayList<Carta>();
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
	
	public boolean tieneTurno() {
		return true;
	}
	
	//agrego
	public boolean tieneCartas() {
		if(cartas.isEmpty()) {
			return false;
		}
		return true;
	}

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
	
	public Carta getCarta(int c) {
		return cartas.get(c);
	}
	
	public int getCantidadCartas() {
		return cartas.size();
	}
	
	
}

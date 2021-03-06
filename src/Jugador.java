import java.util.ArrayList;
import java.util.Random;

public class Jugador {

	private String nombre;
	private ArrayList<Carta>cartasJugador;
	private Estrategia estrategia;

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.cartasJugador=new ArrayList<Carta>();
	}

	public Jugador() {
		this.nombre = nombre;
		this.cartasJugador=new ArrayList<Carta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public Estrategia getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartasJugador = cartas;
	}
	
	public void borrarCartas(Carta carta) {
		cartasJugador.remove(carta);
	}
	
	public boolean tieneTurno() {
		return true;
	}
	
	//agrego
	public boolean tieneCartas() {
		if(cartasJugador.isEmpty()) {
			return false;
		}
		return true;
	}

	public void agregarCarta(Carta c) {
		cartasJugador.add(c);
		
	}

	
	public Carta getPrimerCarta() {
		return cartasJugador.get(0);
	}
	 
	
	public Carta eliminarPrimerCarta() {
		return cartasJugador.remove(0);
	}
	
	public int getCantidadCartas() {
		return cartasJugador.size();
	}
	
	public String getAtributoRandom() {
		Carta carta=cartasJugador.get(0);
		ArrayList<Atributo>atributos=carta.getAtributos();
		int retorno=(int) (Math.random() * atributos.size());
		return atributos.get(retorno).getNombre();
	}
	

	public int totalCartas() {
		int i = 0;
		for (Carta c : cartasJugador) {
			i++;
			}
		return i;
	}

	
}

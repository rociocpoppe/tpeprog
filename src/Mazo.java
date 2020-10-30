import java.util.ArrayList;

public class Mazo {
	
	private ArrayList<Carta>cartas;
	private String nombre;
	private int cantidad;
	

	public Mazo(ArrayList<Carta> cartas, String nombre, int cantidad) {
		this.cartas = cartas;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}


	public ArrayList<Carta> getCartas() {
		return new ArrayList<>(this.cartas);
	}


	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	//agregar cartas
	public void addCartas(Carta carta) {
		if(carta.verificarCartas(carta)) { //deberia verificar la carta antes de agregarla al mazo?
			cartas.add(carta);	
		}
		
	}
	
	//borrar cartas
	public void borrarCartas(Carta carta) {
		cartas.remove(carta);
	}
	
	
	public Carta primerCarta() {
		return cartas.get(0);
	}
	
}

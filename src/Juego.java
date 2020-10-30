import java.util.ArrayList;

public class Juego {

	private ArrayList<Mazo>mazos;
	private ArrayList<Carta>cartas;
	private Jugador jugador1;
	private Jugador jugador2;
	private int cantidadRondas;
	
	public Juego(ArrayList<Mazo> mazos, ArrayList<Carta> cartas, String jugador1, String jugador2, int cantidadRondas) {
		this.mazos =  new ArrayList<>();
		this.cartas=new ArrayList<>();
		this.jugador1 =  new Jugador(jugador1);
		this.jugador2 =  new Jugador(jugador2);
		this.cantidadRondas = cantidadRondas;
	}

	public ArrayList<Mazo> getMazos() {
		return new ArrayList<>(this.mazos);
	}

	public void setMazos(ArrayList<Mazo> mazos) {
		this.mazos = mazos;
	}


	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}

	public int getCantidadRondas() {
		return cantidadRondas;
	}

	public void setCantidadRondas(int cantidadRondas) {
		this.cantidadRondas = cantidadRondas;
	}
	

	public void borrarCartas() {
		for(int i=0; i<cartas.size();i++) {
			cartas.remove(i);
		}
		
	}
		
	
	public void repatirCartas(Jugador jugador1, Jugador jugador2) {
		int cantidadCartas=1;
		for(Carta c: cartas){
			if(cantidadCartas%2==0) {
				jugador1.agregarCarta(c);
			}else {
				jugador2.agregarCarta(c);
			}
			cantidadCartas++;
		}
		
			this.borrarCartas();
	}
	
	
	public void jugar() {
		int jugada1;
		int jugada2;
		for (int i=0; i<cantidadRondas; i++) {
			jugada1=jugador1.getAtributoRandom(carta);
			jugada2=jugador2.getAtributoRandom(carta);
			if(jugada1>jugada2) {
				jugador1.agregarCarta(carta);
				jugador2.borrarCartas(carta);
			}else {
				jugador2.agregarCarta(carta);
				jugador1.borrarCartas(carta);
			}
		}
		Jugador ganador= getGanador();
		if(ganador!=null) {
			System.out.println("Ganó el jugador " + ganador.getNombre());
		}
	}
	

	public Jugador getGanador() {
		if (jugador1.getCantidadCartas()>jugador2.getCantidadCartas()){
			return jugador1;
		}else if (jugador2.getCantidadCartas()<(jugador1.getCantidadCartas())) {
			return jugador2;
		}else {
			return null;
		}
	}
	
	
	
	
	
}
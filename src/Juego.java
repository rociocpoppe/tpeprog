import java.util.ArrayList;

public class Juego {

	
	private ArrayList<Carta>cartas;
	private Mazo mazo;
	private Jugador jugador1;
	private Jugador jugador2;
	private int cantidadRondas;
	private ArrayList<String>anotador;
	
	public Juego() {
		this.cartas=new ArrayList<>();
		this.mazo=new Mazo();
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.cantidadRondas = cantidadRondas;
		this.anotador=new ArrayList<>();
	}
	
	public Juego(ArrayList<Carta> cartas, Mazo mazo, String jugador1, String jugador2, int cantidadRondas) {
		this.cartas=new ArrayList<>();
		this.mazo=new Mazo();
		this.jugador1 =  new Jugador(jugador1);
		this.jugador2 =  new Jugador(jugador2);
		this.cantidadRondas = cantidadRondas;
		this.anotador=new ArrayList<>();
	}
	
	public Mazo getMazo() {
		return mazo;
	}

	public void setMazo(Mazo mazo) {
		this.mazo = mazo;
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
	
	public ArrayList<Carta> getCartas() {
		return new ArrayList <Carta> (this.cartas);
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
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
	public void asignarTurno() {
		String turno="turno";
		if(this.getGanador().equals(jugador1)) {
			jugador1.tieneTurno();
		}else if(this.getGanador().equals(jugador2)) {
			jugador2.tieneTurno();
		}else {
			jugador1.tieneTurno();
		}
		
	}
	
	public void repartirCartas(Jugador jugador1, Jugador jugador2) {
		int cantidadCartas=mazo.getCantidad();
		for(int i=0; i<cantidadCartas;i++){
			if(cantidadCartas%2==0) {
				jugador2.agregarCarta(mazo.borrarPrimerCarta());;
			}else {
				jugador1.agregarCarta(mazo.borrarPrimerCarta());
			}
		}
		
	}
	
	public ArrayList<String> getAnotador() {
		return new ArrayList<>(this.anotador);
	}

	public void setAnotador(ArrayList<String> anotador) {
		this.anotador = anotador;
	}

	public void jugar() {
		if(mazo.mazoCorrecto()) {
			repartirCartas(jugador1, jugador2);
			if ((jugador1.tieneCartas()) || (jugador2.tieneCartas())){
				if(!jugador1.tieneCartas()){
					System.out.println(" -------------------------"+"\n"+" Termino el juego:El ganador es el jugador   "+ jugador1.getNombre());
				}else if(!jugador2.tieneCartas()){
					System.out.println( " -------------------------"+"\n"+" Termino el juego:El ganador es el jugador   "+ jugador2.getNombre());
				}
			} 
			int ronda=1;
			Carta carta1;
			Carta carta2;
			String empate;
			String atributoAComparar1=jugador1.getAtributoRandom();
			String atributoAComparar2=jugador2.getAtributoRandom();
			while (ronda<=this.cantidadRondas) {
				anotador.add("Comienza Ronda "+ronda);
				anotador.add("Cantidad de cartas jugador "+jugador1.getNombre()+" :"+jugador1.totalCartas() +"\n"+"Cantidad de cartas jugador "+jugador2.getNombre()+" :"+jugador2.totalCartas()+"\n");
				carta1=jugador1.eliminarPrimerCarta();
				carta2=jugador2.eliminarPrimerCarta();;
				Atributo atributo1=carta1.getAtributo(atributoAComparar1);
				Atributo atributo2=carta2.getAtributo(atributoAComparar2);
				anotador.add("El jugador "+jugador1.getNombre() + " compite con " + atributo1);
				anotador.add("El jugador "+jugador2.getNombre() + " compite con " + atributo2);
				if(atributo1.compareTo(atributo2)>0) {
					jugador1.agregarCarta(carta2);
					jugador2.borrarCartas(carta2);
					jugador1.tieneTurno();
				}else if(atributo1.compareTo(atributo2)<0) {
					jugador2.agregarCarta(carta1);
					jugador1.borrarCartas(carta1);
					jugador2.tieneTurno();
				}else {
					mazo.addCartas(carta1);
					mazo.addCartas(carta2);
					empate="Empate";
				}
				ronda++;
			}
			Jugador ganador= getGanador();
			if(ganador!=null) {
				anotador.add("Ganó el jugador " + ganador.getNombre());
			}
		}
	}

	public Jugador getGanador() {
		if (jugador1.getCantidadCartas()>jugador2.getCantidadCartas()){
			return jugador1;
		}else if (jugador2.getCantidadCartas()<(jugador1.getCantidadCartas())) {
			jugador2.tieneTurno();
			return jugador2;
		}else {
			return null;
		}
	}
	 

	
}

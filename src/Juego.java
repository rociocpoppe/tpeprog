import java.util.ArrayList;

public class Juego {

	private ArrayList<Mazo>mazos;
	private ArrayList<Carta>cartas;
	private Mazo mazo;
	private Jugador jugador1;
	private Jugador jugador2;
	private int cantidadRondas;
	private ArrayList<String>anotador;
	
	public Juego() {
		this.mazos =  new ArrayList<>();
		this.cartas=new ArrayList<>();
		this.mazo=new Mazo();
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.cantidadRondas = cantidadRondas;
		this.anotador=new ArrayList<>();
	}
	
	public Juego(ArrayList<Mazo> mazos, ArrayList<Carta> cartas, Mazo mazo, String jugador1, String jugador2, int cantidadRondas) {
		this.mazos =  new ArrayList<>();
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
		int cantidadCartas=1;
		mazo.mezclar();
		for(Carta c: cartas){
			if(cantidadCartas%2==0) {
				jugador2.agregarCarta(c);
			}else {
				jugador1.agregarCarta(c);
			}
			cantidadCartas++;
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
			for (int i=0; i<cantidadRondas; i++) {
				if((!(jugador1.tieneCartas()) || (!(jugador2.tieneCartas())))){
					if(!(jugador1.tieneCartas())) {
						anotador.add("Ganó el jugador " + jugador2.getNombre());
					}else {
						anotador.add("Ganó el jugador " + jugador1.getNombre());
					}// no agrega las cartas al jugador 1
					/*Carta carta1=jugador1.getCarta(0);
					this.anotador.add("El jugador "+ jugador1.getNombre() + "juega con la carta: " + carta1);
					Carta carta2=jugador2.getCarta(0);
					this.anotador.add("El jugador "+ jugador2.getNombre() + "juega con la carta: " + carta2);
					/*Atributo atributo1=carta1.getAtributoRandom();
					Atributo atributo2=carta2.getAtributoRandom();
					this.anotador.add("El jugador "+ jugador1.getNombre() + "juega con el atributo: " + carta1);
					this.anotador.add("El jugador "+ jugador2.getNombre() + "juega con el atributo: " + carta2);
					/*int comparar=carta1.compareTo(carta2);
					if(comparar>0) {
						System.out.println("Gana la ronda jugador " +jugador1.getNombre());
					}else if (comparar<0) {
						System.out.println("Gana la ronda jugador " +jugador2.getNombre());
					}
					else {
						System.out.println("empate");
					}
					/*if(jugador1.getCarta(0).getAtributo(atributoACompetir1).getValor()>jugador2.getCarta(0).getAtributo(atributoAcompetir2).getValor()); 
						jugador1.agregarCarta(cartas.get(i));
						jugador2.borrarCartas(cartas.get(i));
						asignarTurno();
					}else if(jugador1.getCarta(0).getAtributo(atributoACompetir1).getValor()<jugador2.getCarta(0).getAtributo(atributoAcompetir2).getValor()) { 
						jugador2.agregarCarta(cartas.get(i));
						jugador1.borrarCartas(cartas.get(i));
						asignarTurno();
					}if (jugador1.getCarta(0).getAtributo(atributoACompetir1).getValor()==jugador2.getCarta(0).getAtributo(atributoAcompetir2).getValor()) { 
						System.out.println("Empate");
						mazo.addCartas(jugador1.getCarta(0));
						mazo.addCartas(jugador2.getCarta(0));
						asignarTurno();
					}*/
			}
			/*Jugador ganador= getGanador();
			if(ganador!=null) {
				System.out.println("Ganó el jugador " + ganador.getNombre());
			}*/
		}}
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

import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main (String [] args) {
		 String mazoPath = "./src/superheroes.json";
		 Mazo mazo= new Mazo();
		 mazo.mostrarMazo(mazoPath);
		 Jugador jugador1= new Jugador();
		 Jugador jugador2=new Jugador();
		 jugador1.setNombre("Sofia");
		 jugador2.setNombre("Rocio");
		 Juego juego= new Juego();
		 juego.setJugador1(jugador1);
		 juego.setJugador2(jugador2);
		 juego.setCantidadRondas(20);
		 juego.setMazo(mazo);
		 juego.jugar();
	     System.out.println(juego.getAnotador());
		 
	  
	 }
}
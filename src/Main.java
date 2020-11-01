import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main (String [] args) {
		 
		 Mazo mazoAJugar= new Mazo();
		 Jugador jugador1= new Jugador();
		 Jugador jugador2=new Jugador();
		 Juego juego= new Juego();
		 jugador1.setNombre("Sofia");
		 jugador2.setNombre("Rocio");
		 jugador1.getCartas();
		 jugador2.getCartas();
		 juego.setJugador1(jugador1);
		 juego.setJugador2(jugador2);
		 juego.setCantidadRondas(20);
		 juego.setMazo(mazoAJugar);
		 String mazoPath = "./src/superheroes.json";
	     VisorMazo.mostrarMazo(mazoPath); 
		 juego.jugar();
	     System.out.println(juego.getAnotador());
		 
	 }
}
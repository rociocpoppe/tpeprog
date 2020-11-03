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
		 ArrayList <Atributo> atributos= new ArrayList<>();
		 Ambicioso ambicioso= new Ambicioso(atributos);
		 Obstinado obstinado= new Obstinado(atributos);
		 Timbero timbero= new Timbero(atributos);
		 Pocima fortalecedora= new PocimaIncremental("fortalecedora",20);
		 Pocima fortalecedoraPlus= new PocimaIncremental("fortalecedoraPlus", 50);
		 Pocima kriptonita=new PocimaDecremental("kriptonita",25);
		 Pocima reductorPlomo= new PocimaDecremental("reductorPlomo", 55);
		 Pocima quieroVale4= new PocimaFija("quieroVale4",4);
		 Pocima numeroMagico= new PocimaFija("numeroMagico", 23);
		 Pocima selectivaFuerza= new PocimaSelectiva("fuerza", 35);
		 Pocima selectivaPeso= new PocimaSelectiva("peso",43);
		 ArrayList<Pocima> pocimas= new ArrayList<Pocima>();
		 pocimas.add(selectivaFuerza);
		 pocimas.add(fortalecedora);
		 Pocima cocktail= new PocimaCocktail("cocktail",pocimas);
		 mazo.addPocimas(cocktail);
		 mazo.addPocimas(selectivaPeso);
		 mazo.addPocimas(selectivaFuerza);
		 mazo.addPocimas(numeroMagico);
		 mazo.addPocimas(quieroVale4);
		 mazo.addPocimas(fortalecedoraPlus);
		 mazo.addPocimas(fortalecedora);
		 mazo.addPocimas(reductorPlomo);
		 mazo.addPocimas(kriptonita);
		 Juego juego= new Juego();
		 juego.setJugador1(jugador1);
		 juego.setJugador2(jugador2);
		 juego.setCantidadRondas(20);
		 juego.setMazo(mazo);
		 juego.jugar();
	     System.out.println(juego.getAnotador());
		 
	  
	 }
}
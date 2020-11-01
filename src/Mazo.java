import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;


public class Mazo {
	
	private ArrayList<Carta>cartas;
	private String nombre;
	private int cantidad;
	

	public Mazo(ArrayList<Carta> cartas, String nombre, int cantidad) {
		this.cartas = new ArrayList<>();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public Mazo() {
		this.cartas = new ArrayList<>();
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
		if(carta.verificarCartas(carta)) {
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
	
	
	//agrego
	public boolean mazoCorrecto() {
		if(this.cantidad==getCantidad()){
			for (Carta carta : cartas){
				if(!(cartas.get(0).equals(carta))){
					return false;
				}
			}return true;
		}return false;
	}
	
	
	//agrego
	public void borrarCartas() {
		for(int i=0;i<cantidad;i++){
			cartas.remove(i);
		}
	
	}
	
	public void importMazo (String jsonFile) {
        File jsonInputFile = new File(jsonFile);
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            JsonReader reader = Json.createReader(is);
            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
            	Carta carta1 = new Carta(carta.getString("nombre"));
            	JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
                for (String nombreAtributo : atributos.keySet()) {
                	
                	Atributo atr = new Atributo(nombreAtributo, atributos.getInt(nombreAtributo));
                	carta1.addAtributo(atr);
                }
                
                this.addCartas(carta1);
            }
            reader.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	}
	
	//agrego mezclar cartas
	
	public void mezclar() {
		Collections.shuffle(cartas);
	}
	
	public boolean esImpar() {
		if(this.getCantidad()/2==0) {
			return true;
		}return false;
	}

	public void add(Collection<? extends Carta> cartasMazo) {
		cartas.addAll(cartasMazo);
		
	}


}

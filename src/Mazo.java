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
		return new ArrayList<Carta>(cartas);
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
		return cartas.size();
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	//agregar cartas
	public void addCartas(Carta carta) {
		cartas.add(carta);		
	}
	
	//borrar cartas
	public void borrarCartas(Carta carta) {
		cartas.remove(carta);
	}
	
	
	public Carta borrarPrimerCarta() {
		return cartas.remove(0);
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
	
	
	//agrego mezclar cartas
	
	public void mezclar() {
		Collections.shuffle(cartas);
	}
	
	public boolean esImpar() {
		if(!(this.getCantidad()/2==0)) {
			return true;
		}return false;
	}
	public static void mostrarMazo(String jsonFile) {
        //URL url = getClass().getResource(jsonFile);
        File jsonInputFile = new File(jsonFile);
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Creo el objeto JsonReader de Json.
            JsonReader reader = Json.createReader(is);
            // Obtenemos el JsonObject a partir del JsonReader.
            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
                String nombreCarta = carta.getString("nombre");
                JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
                String atributosStr = "";
                for (String nombreAtributo:atributos.keySet())
                    atributosStr = atributosStr + nombreAtributo + ": " +
                            atributos.getInt(nombreAtributo) + "; ";
                System.out.println(nombreCarta+"\t\t\t"+atributosStr);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

	/*public void cargarMazo(String jsonFile) {
    File jsonInputFile = new File(jsonFile);
    InputStream is;
    try {
        is = new FileInputStream(jsonInputFile);
        // Creo el objeto JsonReader de Json.
        JsonReader reader = Json.createReader(is);
        // Obtenemos el JsonObject a partir del JsonReader.
        JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
        for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
            String nombreCarta = carta.getString("nombre");
            Carta cartaNueva = new Carta(nombreCarta);
            JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
            String atributosStr = "";
            for (String nombreAtributo:atributos.keySet()){
            	int valorAtributo = atributos.getInt(nombreAtributo);
            	Atributo nuevoAtributo = new Atributo(nombreAtributo, valorAtributo);
            	cartaNueva.addAtributo(nuevoAtributo);
            }
            this.addCartas(cartaNueva);
        }

        reader.close();
        
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
	}*/
}

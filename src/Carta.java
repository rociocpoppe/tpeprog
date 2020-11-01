import java.util.ArrayList;
import java.util.Random;

public class Carta{

	private String nombre;
	private int cantidadAtributos;
	private ArrayList<Atributo>atributos;
	
	public Carta(String nombre, int cantidadAtributos) {
		this.nombre = nombre.toUpperCase();
		this.cantidadAtributos = cantidadAtributos;
		this.atributos = new ArrayList<Atributo>();
	}
	
	
	public Carta(String nombre) {
		this.nombre = nombre.toUpperCase();
		this.cantidadAtributos = cantidadAtributos;
		this.atributos = new ArrayList<Atributo>();
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadAtributos() {
		return cantidadAtributos;
	}

	public void setCantidadAtributos(int cantidadAtributos) {
		this.cantidadAtributos = cantidadAtributos;
	}

	public ArrayList<Atributo> getAtributos() {
		return new ArrayList<>(this.atributos);
	}

	public void setAtributos(ArrayList<Atributo> atributos) {
		this.atributos = atributos;
	}
	
	//agregue
	public void addAtributo(Atributo atributo) {
		atributos.add(atributo);
	}
	
	public Atributo getAtributo(int c) {
		return atributos.get(c);
	}


	public boolean contieneAtributo(Atributo atributo) {
		return (this.getAtributos().contains(atributo));
	}

	
	//agregué
	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", atributos=" + atributos + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Carta otra=(Carta)o;
			if(this.cantidadAtributos==4) {
				if(this.getCantidadAtributos()==(otra.getCantidadAtributos())) {
					int i=0;
					for(Atributo a: this.atributos) {
						for(Atributo b:this.atributos) {
							if(a.getNombre().equals(b.getNombre())) {
								i++;
								return true;
							}else {
								System.out.println("No tienen los mismos atributos");
							}
						}
					}
				}return true;
			}else{
				System.out.println("Las cartas no tienen la misma cantidad de atributos");
				return false;
			}
		}catch (Exception exc) {
			return false;
		}
	}
	
	
	 
	public boolean verificarCartas (Carta carta) {
		if(this.getCantidadAtributos()==carta.getCantidadAtributos()) {
			for(int i=0; i<this.atributos.size();i++) {
				Atributo atributo=this.atributos.get(i);
				if(!carta.contieneAtributo(atributo)) {
					return false;
				}
				return true;
			}
		}return false;
	}


	public String getAtributoRandom() {
		Jugador jugador=new Jugador();
		Carta aux = jugador.getPrimerCarta();
		int atributos=aux.getCantidadAtributos();
		Random rand = new Random();
		return aux.getAtributo(rand.nextInt(atributos)).getNombre();
		
	}
	


	
									
				
	
				
}
				
				
				
				
				
				
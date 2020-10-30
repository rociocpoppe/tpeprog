import java.util.ArrayList;

public class Carta{

	private String nombre;
	private int cantidadAtributos;
	private ArrayList<Atributo>atributos;
	
	public Carta(String nombre, int cantidadAtributos, ArrayList<Atributo> atributos) {
		this.nombre = nombre;
		this.cantidadAtributos = cantidadAtributos;
		this.atributos = atributos;
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

	public boolean contieneAtributo( Atributo atributo) {
		return (this.getAtributos().contains(atributo));
	}

				
}
				
				
				
				
				
				
import java.util.ArrayList;

public abstract class Estrategia {
	

	protected ArrayList<Atributo> atributos;
	
	
	public Estrategia(ArrayList<Atributo> atributos) {
		this.atributos = new ArrayList<Atributo>();
	}


	public ArrayList<Atributo> getAtributos() {
		return new ArrayList<Atributo>(this.atributos);
	}


	public void setAtributos(ArrayList<Atributo> atributos) {
		this.atributos = atributos;
	}


	public abstract void elegirEstrategia(Carta carta);
	
}

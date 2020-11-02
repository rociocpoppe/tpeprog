import java.util.ArrayList;

public class Obstinado extends Estrategia {
	
	private String atributoElegido;
	
	public Obstinado(ArrayList<Atributo> atributos) {
		super(atributos);
		this.atributoElegido=atributoElegido;
		
	}

	public String getAtributoElegido() {
		return atributoElegido;
	}

	public void setAtributoElegido(String atributoElegido) {
		this.atributoElegido = atributoElegido;
	}

	@Override
	public void elegirEstrategia(Carta carta) {
		carta.getAtributo(this.getAtributoElegido());
	}

}


import java.util.ArrayList;

public class Timbero extends Estrategia{

	
	
	public Timbero(ArrayList<Atributo> atributos) {
		super(atributos);
	}

	@Override
	public void elegirEstrategia(Carta carta) {
		String atributos="";
		for (int i=0; i<carta.getAtributos().size();i++) {
			int retorno=(int)Math.floor((Math.random()*carta.getCantidadAtributos()));
			atributos=carta.getAtributos().get(retorno).getNombre();
		}
	}
	
}

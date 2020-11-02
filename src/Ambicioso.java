import java.util.ArrayList;
import java.util.Collections;

public class Ambicioso extends Estrategia{

	
	public Ambicioso(ArrayList<Atributo> atributos) {
		super(atributos);
	}

	@Override
	public void elegirEstrategia(Carta carta) {
		ArrayList<Atributo> retorno=new ArrayList<>();
		int max = Integer.MIN_VALUE;
	       for(int i=0; i<atributos.size(); i++){
	           if(atributos.get(i).getValor() > max){
	               max = atributos.get(i).getValor();
	           }
	       }
	}

}

import java.util.ArrayList;

public class PocimaDecremental extends Pocima {

	private int valorReduccion;
	private ArrayList<Atributo>atributos;
	
	public PocimaDecremental(String tipoPocima) {
		super(tipoPocima);
		this.valorReduccion=valorReduccion;
	}

	public int getvalorReduccion() {
		return valorReduccion;
	}

	public void setValorReduccion(int porcentajeReduccion) {
		this.valorReduccion = porcentajeReduccion;
	}

	@Override
	public int calcularPocimas(Atributo a) {
		int aux=a.getValor();
		int retorno= (int)((aux - (aux * valorReduccion/100)));
		
		return retorno;
	}
}

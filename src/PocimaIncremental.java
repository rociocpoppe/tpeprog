import java.util.ArrayList;

public class PocimaIncremental extends Pocima {

	protected int valorIncremento;

	
	public PocimaIncremental(String tipoPocima, int valorIncremento) {
		super(tipoPocima);
		this.valorIncremento=valorIncremento;
	}
	
	

	public int getValorIncremento() {
		return valorIncremento;
	}



	public void setValorIncremento(int valorIncremento) {
		this.valorIncremento = valorIncremento;
	}



	@Override
	public int calcularPocimas(Atributo a) {
		int aux=a.getValor();
		int retorno= (int)((aux + (aux * valorIncremento/100)));
		return retorno;
	}

}

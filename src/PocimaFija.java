
public class PocimaFija extends Pocima {

	private int valorFijo;
	
	public PocimaFija(String tipoPocima) {
		super(tipoPocima);
		this.valorFijo=valorFijo;

	}
	

	public int getValorFijo() {
		return valorFijo;
	}



	public void setValorFijo(int valorFijo) {
		this.valorFijo = valorFijo;
	}



	@Override
	public int calcularPocimas(Atributo a) {
		return this.valorFijo;
	}


	

}

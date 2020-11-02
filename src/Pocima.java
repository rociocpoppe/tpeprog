
public abstract class Pocima {

	protected String tipoPocima;
	protected int valor;
	
	public Pocima(String tipoPocima) {
		this.tipoPocima = tipoPocima;
		this.valor=valor;
	}
	
	public String getTipoPocima() {
		return tipoPocima;
	}

	public void setTipoPocima(String tipoPocima) {
		this.tipoPocima = tipoPocima;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Pocima [tipoPocima=" + tipoPocima + ", valor=" + valor + "]";
	}

	public abstract int calcularPocimas(Atributo a);
	
	
}

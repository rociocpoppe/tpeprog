import java.util.ArrayList;

public class PocimaCocktail extends Pocima{

	private ArrayList<Pocima>pocimas;
	
	public PocimaCocktail(String tipoPocima) {
		super(tipoPocima);
		this.pocimas=new ArrayList<Pocima>();
	}
	
	public void addPocima(Pocima pocimanueva) {
		pocimas.add(pocimanueva);
	}
	
	@Override
	public int calcularPocimas(Atributo a) {
		int cantidadPocimas=0;
		for(Pocima pocima: pocimas) {
			cantidadPocimas+=pocima.getValor();	
		}return cantidadPocimas;
	}
	

	

}

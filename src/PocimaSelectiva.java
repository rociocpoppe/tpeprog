
public class PocimaSelectiva extends PocimaIncremental {
	
	private Atributo atributoSeleccionado;

	public PocimaSelectiva(String tipoPocima, Atributo atributoSeleccionado) {
		super(tipoPocima);
		this.atributoSeleccionado=new Atributo();
		
	}

	@Override
	public int calcularPocimas(Atributo a) {
		int retorno=0;
		if(this.atributoSeleccionado.equals(a)) {
			int aux=atributoSeleccionado.getValor();
			retorno=(int)((aux + (aux * valorIncremento/100)));
		}
		return retorno;
	}


}

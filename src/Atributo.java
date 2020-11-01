
public class Atributo extends Comparable {
	
	private String nombre;
	private int valor;
	private String pelea;
	
	public Atributo(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
		this.pelea=pelea;
	}
	
	public Atributo() {
		this.nombre = nombre;
		this.valor = valor;
		this.pelea=pelea;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
	@Override
    public int compareTo(Atributo atrib) {
		return this.valor -atrib.getValor();
				
	}
	
	//agrego
	public boolean ganaCompetencia(Atributo cartaAtrib2){
		System.out.println("Se compite por: "+getNombre() +"atributo\n"+"Ronda: "+getPelea()+"\n");
		if(getValor()>cartaAtrib2.getValor()){
			return true;
		}else if(getValor()<cartaAtrib2.getValor()){
			return false;
		}return false;					
	}

	
	public String getPelea() {
		return pelea;
	}

	public void setPelea(String pelea) {
		this.pelea = pelea;
	}

	@Override
	public boolean equals(Object o) {
		try {
			Atributo otro= (Atributo)o;
			return this.getNombre().equals(otro.getNombre());
		}catch (Exception exc) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Atributo [nombre=" + nombre + ", valor=" + valor + "]";
	}
	
	

}

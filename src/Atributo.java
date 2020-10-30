
public class Atributo extends Comparable {
	
	private String nombre;
	private double valor;
	
	public Atributo(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public void compararAtributos() {
		
	}
	
	@Override
    public int compareTo(Atributo atrib) {
		if(this.getValor() < atrib.getValor()){
			return -10;
		} else if (this.getValor() > atrib.getValor()) {
			  return 10;
		}else{
			return 0;
		}
				
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
		return nombre+" "+valor;
	}

	
	

}

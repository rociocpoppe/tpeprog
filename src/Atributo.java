
public class Atributo implements Comparable {
	
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
	public int compareTo(Atributo atributo) {
		return this.getValor() - atributo.getValor();
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

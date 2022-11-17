
public class Libro {
	
	private int capitulos;

	public Libro(int capitulos) {
		super();
		this.capitulos = capitulos;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public String toString() {
		return "Libro [capitulos=" + capitulos + "]";
	}
	
	public void prestamo() {
		
	}

}

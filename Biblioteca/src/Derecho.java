
public class Derecho extends Libro {
	
	public Derecho(int capitulos) {
		super(capitulos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prestamo() {
		System.out.println("Préstamos por 5 semanas");
	}

}

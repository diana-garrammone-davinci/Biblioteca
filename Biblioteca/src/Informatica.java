
public class Informatica extends Libro {

	public Informatica(int capitulos) {
		super(capitulos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prestamo() {
		System.out.println("Préstamos por 2 semanas");
	}

}


public class Filosofia extends Libro {
	
	public Filosofia(int capitulos) {
		super(capitulos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prestamo() {
		System.out.println("Pr�stamos por 2 semanas");
	}

}

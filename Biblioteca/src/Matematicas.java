
public class Matematicas extends Libro {

	public Matematicas(int capitulos) {
		super(capitulos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prestamo() {
		if(this.getCapitulos()==1) {
			System.out.println("Préstamos por 1 semana");
		}else if(this.getCapitulos()<1) {
			System.out.println("No expisten libros con menos de un capítulo");
		}else {
			System.out.println("Préstamos por 3 semana");
		}
		
	}

}


public class Matematicas extends Libro {

	public Matematicas(int capitulos) {
		super(capitulos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prestamo() {
		if(this.getCapitulos()==1) {
			System.out.println("Pr�stamos por 1 semana");
		}else if(this.getCapitulos()<1) {
			System.out.println("No expisten libros con menos de un cap�tulo");
		}else {
			System.out.println("Pr�stamos por 3 semana");
		}
		
	}

}

package curso1;

public class TestaLacos {
	
	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 0; contador <= 10; contador++) {
				int resultado = multiplicador * contador;
				System.out.print(resultado);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

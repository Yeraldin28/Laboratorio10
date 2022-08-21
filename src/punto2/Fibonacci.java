
package punto2;

public class Fibonacci {

	// Se declaran los atributos de la clase
	private int numero;

	// Se declara el m�todo constructor por defecto
	public Fibonacci() {

	}

	// Se declara el m�todo constructor con par�metros
	public Fibonacci(int numero) {
		this.numero = numero;

	}

	// Getters y setters de las variables privadas
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// M�todo que devuelve la sucesi�n de manera iterativa
	public String fibonacciIterativo(int numero) {
		long siguiente = 1, actual = 0, temporal = 0;
		String texto = "";
		for (long x = 1; x <= numero; x++) {
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
			texto += actual + " ";
		}
		return texto;

	}

	// M�todo para que devuelve la sucesi�n de forma recursiva
	public long fibonacciRecursivo(int numero) {
		if (numero < 2) {
			return numero;
		}
		return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
	}

	// M�todo para almacenar el resultado de la funci�n recursiva
	public String textoRecursivo(int numero) {
		String texto = "";
		for (int i = 1; i <= numero; i++) {
			texto += fibonacciRecursivo(i) + " ";
		}
		return texto;
	}

}

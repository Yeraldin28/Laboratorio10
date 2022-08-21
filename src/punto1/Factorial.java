
package punto1;

public class Factorial {

	// Se declaran los atributos de la clase
	private int numero;

	// Se declara el m�todo constructor por defecto
	public Factorial() {

	}

	// Se declara el m�todo constructor con par�metros
	public Factorial(int numero) {
		this.numero = numero;

	}

	// Getters y setters de las variables privadas
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// M�todo para calcular el factorial iterativo
	public long factorialIterativo(int numero) {
		if (numero < 0)
			numero = numero * -1;
		if (numero <= 0)
			return 1;
		long factorial = 1;
		while (numero > 1) {
			factorial = factorial * numero;
			numero--;
		}
		return factorial;
	}

	// M�todo para el factorial recursivo
	public long factorialRecursivo(int numero) {
		if (numero <= 1)
			return 1;
		return numero * factorialRecursivo(numero - 1);
	}

}
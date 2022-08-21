
package punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA LA POSICI�N DE LA SUCESI�N DE FIBONACCI INGRESADA");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir = 1;

		do {
			// Se declaran las variables a usar
			int numero, decision = 0;
			String fibonacci = "";

			// Se pide los datos a ingresar en el objeto
			System.out.print("\n\n\tIngresa cuantos datos de la sucesion deseas ver: ");
			numero = Integer.parseInt(in.readLine());

			do {
				System.out.print((decision > 1 || decision < 2)
						? "\n\n\t�Quieres calcular la sucesi�n de manera iterativa o recursiva? \n\n\t1. Iterativo\n\t2. Recursivo\n\n\tDecisi�n: "
						: "\n\n\tIngresa un n�mero valido:");
				decision = Integer.parseInt(in.readLine());
			} while (decision < 1 || decision > 2);

			// Se declara el objeto de tipo Fibonacci
			Fibonacci numero1 = new Fibonacci(numero);

			// Dependiendo de la opci�n que haya elegido el usuario se calcula la sucesi�n
			switch (decision) {
			case 1:
				fibonacci = numero1.fibonacciIterativo(numero);
				break;
			case 2:
				fibonacci = numero1.textoRecursivo(numero);
				break;
			}

			// Muestro el resultado de los m�todos
			System.out.print("\n\n\tLos: " + numero1.getNumero() + " primeros numeros de la sucesi�n de fibonacci son: "
					+ fibonacci);

			// Se le pregunta al usuario si quiere volver a usar el programa
			do {
				System.out.print((repetir > 1 || repetir < 2)
						? "\n\n\t�Quieres volver a usar el programa? \n\n\t1. Si\n\t2. No\n\n\tDecisi�n: "
						: "\n\n\tIngresa un n�mero valido:");
				repetir = Integer.parseInt(in.readLine());

			} while (repetir < 1 || repetir > 2);
		} while (repetir == 1);
		System.out.println("\n\n\t\tGRACIAS POR USAR ESTE PROGRAMA\n");

	}
}

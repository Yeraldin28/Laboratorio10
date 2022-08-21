
package punto3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA EL DETERMINANTE DE UNA MATRIZ 3X3\n\n");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir = 1;

		do {
			// Se declaran las variables a usar
			int matriz[][] = new int[3][3];
			int determinante = 0;

			// Se piden las entradas de la matriz
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print("\tIngresa la entrada [" + (i + 1) + "][" + (j + 1) + "]: ");
					matriz[i][j] = Integer.parseInt(in.readLine());
				}
			}

			// Se declara el objeto de tipo matriz
			Matriz matriz3x3 = new Matriz(matriz);

			// Se le pregunta al usuario si quiere calcular el determinante por el m�todo
			// iterativo o el recursivo
			do {
				System.out.print((repetir > 1 || repetir < 2)
						? "\n\n\t�Quieres calcular el determinante de forma recursiva o iterativa? \n\n\t1. Recursiva\n\t2. Iterativa\n\n\tDecisi�n: "
						: "\n\n\tIngresa un n�mero valido:");
				repetir = Integer.parseInt(in.readLine());

			} while (repetir < 1 || repetir > 2);

			// Se calcula el determinante seg�n la opci�n elegida
			switch (repetir) {
			case 1:
				determinante = matriz3x3.determinanteRecursivo(matriz, 3);
				break;
			case 2:
				determinante = matriz3x3.determinanteIterativo(matriz);
				break;
			}

			// Muestro por consola la matriz ingresada por el usuario y el determinante
			System.out.print("\n\tEl determinante de la matriz: \n\t");
			matriz3x3.leer(matriz);

			System.out.print("\n\n\tEs: " + determinante);

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

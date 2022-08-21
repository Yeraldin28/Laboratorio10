
package punto3;

public class Matriz {

	// Se declaran los atributos de la clase
	private int[][] matriz = new int[3][3];

	// Se declara el m�todo constructor por defecto
	public Matriz() {

	}

	// Se declara el m�todo constructor con par�metros
	public Matriz(int matriz[][]) {
		this.matriz = matriz;
	}

	// Getters y setters de las variables privadas
	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	// M�todo para calcular el determinante recursivo por medio de las matrices de
	// cofactores que se forman cuando se llama a si mismo
	public int determinanteRecursivo(int matriz[][], int n) {
		int determinante = 0;
		if (n == 1)
			return matriz[0][0];

		int cofactores[][] = new int[3][3];
		int signoDeterminante = 1;

		for (int i = 0; i < 3; i++) {
			cofactor(matriz, cofactores, 0, i, 3);
			determinante += signoDeterminante * matriz[0][i] * determinanteRecursivo(cofactores, n - 1);
			signoDeterminante = -signoDeterminante;
		}

		return determinante;
	}

	// M�todo para calcular el n�mero cofactor
	public void cofactor(int matriz[][], int cofactores[][], int p, int q, int n) {
		int fila = 0, columna = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != p && j != q) {
					cofactores[fila][columna++] = matriz[i][j];
					if (columna == n - 1) {
						columna = 0;
						fila++;
					}
				}
			}
		}
	}

	// Se calcula el determinante por medio del m�todo de Montante
	public int determinanteIterativo(int[][] matriz1) {
		int x = 0, y = 0, determinante = 0;
		for (int j = 0; j <= 2; j++) {
			if (j == 0) {
				x = 1;
				y = 2;
			}

			if (j == 1) {
				x = 2;
				y = 0;
			}

			if (j == 2) {
				x = 0;
				y = 1;
			}

			determinante += (matriz1[0][j] * matriz1[1][x] * matriz1[2][y])
					- (matriz1[0][y] * matriz1[1][x] * matriz1[2][j]);
		}

		return determinante;
	}

	// M�todo para mostrar por pantalla las matrices
	public void leer(int matriz[][]) {
		for (int i = 0; i < matriz[0].length; i++) {
			System.out.print("________");
		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\n\t|");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("       |");
			}
			System.out.print("\n\t|");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%2s%3d%2s|", "", matriz[i][j], "");
			}
			System.out.print("\n\t|");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("_______|");
			}
		}
	}

}
package airport_contruction;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int[][] coordenadas;
		double d;
		int n = sc.nextInt();
		
		while (sc.hasNext()) {
			double distanciaL = 0;
			coordenadas = new int[n][2];
			for (int i = 0; i < coordenadas.length; i++) {
				for (int j = 0; j < coordenadas[0].length; j++) {
					// StringTokenizer tk = new StringTokenizer(l);
					coordenadas[i][j] = sc.nextInt();
				}
			}
			int i = 0;
			int j = 0;

			while (i < coordenadas.length - 1) {
				int p = i;
				while (p < coordenadas.length) {
					if (p == i) {
						d = distancia(coordenadas[i][j], coordenadas[i][j + 1], coordenadas[i + 1][j],
								coordenadas[i + 1][j + 1]);
						if (d > distanciaL)
							distanciaL = d;
						p = p + 2;
					} else {
						d = distancia(coordenadas[i][j], coordenadas[i][j + 1], coordenadas[p][j],
								coordenadas[p][j + 1]);
						if (d > distanciaL)
							distanciaL = d;
						p++;
					}

				}
				i++;
			}
			DecimalFormatSymbols sepa = new DecimalFormatSymbols();
			sepa.setDecimalSeparator('.');
			DecimalFormat f = new DecimalFormat("#.000000000", sepa);
			System.out.println(f.format(distanciaL));
			n = sc.nextInt();
		}
		pw.close();
	}

	public static double distancia(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
}

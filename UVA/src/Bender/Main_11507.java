package Bender;
import java.io.*;

public class Main_11507 {
	private static String Nodo_actu;
	private static String line;
	private static int L,i;
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		line = null;
		Nodo_actu = null;
		
		String transicion = "+x";
		while ((line = reader.readLine()) != null && (L = Integer.valueOf(line)) != 0) {
			transicion = "+x";
			String[] Transiciones = reader.readLine().split("\\s+");
			// System.out.println(Transiciones[0]);
			for (i = 0; i < Transiciones.length; i++) {

				if (Transiciones[i].equals("No")) {
					continue;
				}

				if (transicion.equals("+x")) {
					transicion = Transiciones[i];
				} else if (transicion.equals("-x")) {
					String invertedSymbol = Transiciones[i].charAt(0) == '-' ? "+" : "-";
					transicion = invertedSymbol + Transiciones[i].charAt(1);
				} else if (transicion.equals("+y")) {
					if (Transiciones[i].equals("+y")) {
						transicion = "-x";
					} else if (Transiciones[i].equals("-y")) {
						transicion = "+x";
					}
				} else if (transicion.equals("-y")) {
					if (Transiciones[i].equals("+y")) {
						transicion = "+x";
					} else if (Transiciones[i].equals("-y")) {
						transicion = "-x";
					}
				} else if (transicion.equals("+z")) {
					if (Transiciones[i].equals("+z")) {
						transicion = "-x";
					} else if (Transiciones[i].equals("-z")) {
						transicion = "+x";
					}
				} else if (transicion.equals("-z")) {
					if (Transiciones[i].equals("+z")) {
						transicion = "+x";
					} else if (Transiciones[i].equals("-z")) {
						transicion = "-x";
					}
				}
			}
			System.out.println(transicion);

		}
	}
}
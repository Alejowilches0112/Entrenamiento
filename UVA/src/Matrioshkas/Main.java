package Matrioshkas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o = new PrintWriter(System.out);
		String linea = t.readLine();
		while (!linea.equals("")) {
			Stack<Integer> positivos = new Stack<>();
			Stack<Integer> negativos = new Stack<>();
			//String toys [] = linea.
			int cont = linea.length();
			while (cont-- > 0) {
				StringTokenizer tk = new StringTokenizer(linea);
				int toy = Integer.parseInt(tk.nextToken());
				if (toy >= 0) {
					positivos.push(toy);
				}
				else {
					negativos.push(toy);
				}
			}
		}
	}

}

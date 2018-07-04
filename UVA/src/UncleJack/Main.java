package UncleJack;

import java.util.Scanner;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		PrintWriter o = new PrintWriter(System.out);
		int N = t.nextInt();
		int D = t.nextInt();
		BigInteger r;
		long c = 0;
		while (N != 0 || D != 0) {
			if (c == 0) {
				r = new BigInteger(N + "");
				BigInteger result = r.pow(D);
				o.print(result);
				c++;
			} else {
				o.println();
				r = new BigInteger(N + "");
				BigInteger result = r.pow(D);
				o.print(result);
			}
			N = t.nextInt();
			D = t.nextInt();
		}
		o.close();
		t.close();
	}
}

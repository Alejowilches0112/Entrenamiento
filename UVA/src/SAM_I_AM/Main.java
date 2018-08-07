package SAM_I_AM;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	private static Scanner s;
	private static PrintWriter p;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		p = new PrintWriter(System.out);
		
		long R = s.nextLong();
		long C = s.nextLong();
		long N= s.nextLong();
		
		while(R !=0 && C!=0 && N!=0) {
			p.println("hola");
			 R = s.nextLong();
			 C = s.nextLong();
			 N= s.nextLong();
		}
		p.close();
	}
}

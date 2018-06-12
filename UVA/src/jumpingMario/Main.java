package jumpingMario;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner tec;
	static PrintWriter pw;
	static int T;
	static int N;
	static int[] alt;
	
	public static void main(String[] args) {
		tec=new Scanner(System.in);
		pw = new PrintWriter(System.out);
		T=tec.nextInt();
		int caso=1;
		while(T-- > 0) {
			int salAlt = 0;
			int salBaj = 0;
			N= tec.nextInt();
			alt= new int[N];
			for (int i = 0; i < alt.length; i++) {
				alt[i]=tec.nextInt();
				if (i >= 1) {
					if(alt[i]<alt[i-1]) salBaj++;
					else if(alt[i]>alt[i-1])salAlt++;
					else continue;
				}
			}
			pw.println("Case "+caso+": "+salAlt+" "+salBaj);
			caso++;
		}
		pw.close();
	}
	
}

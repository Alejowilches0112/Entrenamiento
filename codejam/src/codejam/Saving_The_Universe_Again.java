package codejam;

import java.io.PrintWriter;
import java.util.Scanner;

public class Saving_The_Universe_Again {
	static PrintWriter pw;
	static Scanner t;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t = new Scanner(System.in);
		pw=new PrintWriter(System.out);
		int T = t.nextInt();
		while (T-- > 0) {
			long D = t.nextLong();
		}
	}

	public static int salvar(long D, String inst) {
		int mv=-1;
		long ataque=1;
		int c=0;
		int daño=0;
		for(int i=0;i<inst.length();i++) {
			if(inst.charAt(i)=='C') {
				ataque*=2;
				c++;
			}else {
				daño+=ataque;
			}
		}
		if(c==inst.length()) {
			mv=0;
		}
		return mv;
	}

}

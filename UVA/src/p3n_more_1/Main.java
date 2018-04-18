package p3n_more_1;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static PrintWriter pw;
	private static Scanner t;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t = new Scanner(System.in);
		pw = new PrintWriter(System.out);
		while (t.hasNext()) {
			//System.currentTimeMillis();
			int i = t.nextInt();
			int j = t.nextInt();
			int tam = 0;
			int b=0;
			if (i > j) {
				tam = (i - j) + 1;
				b = j;
			} else {
				tam = (j - i) + 1;
				b=i;
			}
			int a[] = new int[tam];
			
			for (int k = 0; k < a.length; k++, b++) {
				a[k] = ny1(b);
				// pw.println(i+" "+a[k]);
			}
			Arrays.sort(a);
			System.out.println(i + " " + j + " " + a[a.length - 1]);
		}
	}

	static int ny1(long n) {
		int c = 0;
		// pw=new PrintWriter(System.out);
		while (n != 1) {
			// pw.println(n);
			if (n % 2 != 0) {
				n = (3 * n) + 1;
				c++;
			} else {
				n = n / 2;
				c++;
			}
		}
		c++;
		return c;
	}
}

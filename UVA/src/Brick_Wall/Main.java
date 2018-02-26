package Brick_Wall;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static int a [] = new int [50]; 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
		Scanner i = new Scanner(System.in);
		PrintWriter o = new PrintWriter(System.out);
		// String linea = i.readLine();
		// StringTokenizer tk = new StringTokenizer(linea);
		long n = i.nextLong();
		while (n != 0) {
			o.println(ladrillos(n));
			n = i.nextLong();
		}
		o.close();
	}

	static long ladrillos(long n) {
		if (n <= 3) {
			return n;
		}
		return ladrillos(n - 1) + ladrillos(n - 2);
	}
}

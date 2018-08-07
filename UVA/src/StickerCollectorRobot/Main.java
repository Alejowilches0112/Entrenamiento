package StickerCollectorRobot;

import java.io.PrintWriter; 
import java.util.Scanner;

public class Main {
	private static Scanner t;
	private static PrintWriter o;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t = new Scanner(System.in);
		o = new PrintWriter(System.out);
		int N = t.nextInt();
		int M = t.nextInt();
		int S = t.nextInt();
		int[] pI = new int[2];
		char[][] arena;
		char[] instrucciones;
		while (N != 0 || M != 0 || S != 0) {
			arena = new char[N][M];
			for (int i = 0; i < arena.length; i++) {
				String x = t.next();
				for (int j = 0; j < arena[i].length; j++) {
					if (x.charAt(j) != '#' && x.charAt(j) != '*' && x.charAt(j) != '.') {
						arena[i][j] = x.charAt(j);
						pI[0] = i;
						pI[1] = j;
					} else {
						arena[i][j] = x.charAt(j);
					}
				}
			}
			instrucciones = new char[S];
			String x = t.next();
			for (int j = 0; j < instrucciones.length; j++) {
				instrucciones[j] = x.charAt(j);
			}
			o.println(recogida(arena, instrucciones, pI));
			N = t.nextInt();
			M = t.nextInt();
			S = t.nextInt();
		}
		o.close();
		t.close();
	}

	static long recogida(char[][] arena, char[] instrucciones, int[] pI) {
		long k = 0;
		char orientacion;
		int x = pI[0];
		int y = pI[1];
		orientacion = arena[x][y];
		int z = 0;
		int i = x;
		int j = y;
		for (int l = 0; l < instrucciones.length; l++) {
			if (instrucciones[l] == 'D') {
				switch (orientacion) {
				// N=norte, S=sur, L=Este, O=Oeste
				case 'N':
					orientacion = 'L';
					break;
				case 'S':
					orientacion = 'O';
					break;
				case 'L':
					orientacion = 'S';
					break;
				case 'O':
					orientacion = 'N';
					break;
				}
			} else if (instrucciones[l] == 'E') {
				switch (orientacion) {
				// N=norte, S=sur, L=Este, O=Oeste
				case 'N':
					orientacion = 'O';
					break;
				case 'S':
					orientacion = 'L';
					break;
				case 'L':
					orientacion = 'N';
					break;
				case 'O':
					orientacion = 'S';
					break;
				}
			} else if (instrucciones[l] == 'F') {

				switch (orientacion) {
				case 'N':
					if (i - 1 > -1) {
						if (arena[i - 1][j] == '*') {
							k++;
							arena[i][j] = '.';
							arena[i - 1][j] = orientacion;
							i--;
							break;
						} else if (arena[i - 1][j] == '#')
							break;
						else if (arena[i - 1][j] == '.') {
							arena[i][j] = '.';
							arena[i - 1][j] = orientacion;
							i--;
							break;
						}
					}
					break;
				case 'O':
					if (j - 1 > -1) {
						if (arena[i][j - 1] == '*') {
							k++;
							arena[i][j] = '.';
							arena[i][j - 1] = orientacion;
							j--;
							break;
						} else if (arena[i][j - 1] == '#')
							break;
						else if (arena[i][j - 1] == '.') {
							arena[i][j] = '.';
							arena[i][j - 1] = orientacion;
							j--;
							break;
						}
					}
					break;
				case 'L':
					if (j + 1 < arena[i].length) {
						if (arena[i][j + 1] == '*') {
							k++;
							arena[i][j] = '.';
							arena[i][j + 1] = orientacion;
							j++;
							break;
						} else if (arena[i][j + 1] == '#')
							break;
						else if (arena[i][j + 1] == '.') {
							arena[i][j] = '.';
							arena[i][j + 1] = orientacion;
							j++;
							break;
						}
					}
					break;
				case 'S':
					if (i + 1 < arena.length) {
						if (arena[i + 1][j] == '*') {
							k++;
							arena[i][j] = '.';
							arena[i + 1][j] = orientacion;
							i++;
							break;
						} else if (arena[i + 1][j] == '#')
							break;
						else if (arena[i + 1][j] == '.') {
							arena[i][j] = '.';
							arena[i + 1][j] = orientacion;
							i++;
							break;
						}
					}
					break;
				default:
					break;
				}

			}
		}
		return k;
	}
}

package texas_trip;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double [][] c = new double [2][n];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j]= sc.nextInt();
			}
		}
		System.out.println(area(c));
	}

	public static double area(double[][] coor) {
		double r = 0d;
		int t = coor.length;
		for (int i = 0, j = 1; i < t; i++, j = j + 1 == t ? 0 : j + 1) {
			r += coor[i][0] * coor[j][1] - coor[i][1] * coor[j][0];
		}
		return Math.abs(r) / 2;
	}
}

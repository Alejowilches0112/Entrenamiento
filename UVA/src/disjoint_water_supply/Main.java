package disjoint_water_supply;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int C = sc.nextInt();
			int P = sc.nextInt();
			double[][] uv = new double[P][2];
			for (int i = 0; i < uv.length; i++) {
				for (int j = 0; j < uv[i].length; j++) {
					uv[i][j] = sc.nextDouble();
				}
			}
			int r=segmentos_Disjuntos(uv);
			System.out.println(r);
		}
	}

	public static int sgn(double x) {
		return x != 0 ? (x < 0 ? -1 : 1) : 0;
	}

	public static int segmentos_Disjuntos(double[][] sgs) {
		Arrays.sort(sgs, new Comparator<double[]>() {
			public int compare(double[] a, double[] b) {
				return -sgn(sgn(a[0] - b[0]) != 0 ? a[0] - b[0] : a[1] - b[1]);
			}
		});
		double ult = Double.POSITIVE_INFINITY;
		int res = 0;
		for (double[] sg : sgs) {
			if (sg[1] < ult - 1e-15) {
				ult = sg[0];
				res++;
			}
		}
		return res;
	}
}

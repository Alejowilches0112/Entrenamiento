package Commando_wars;

import java.io.*;
import java.util.*;

public class Main {
	static Scanner t;
	static PrintWriter o;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t = new Scanner(System.in);
		o = new PrintWriter(System.out);
		int soldados = t.nextInt();
		int c = 1;
		while (soldados != 0) {
			int x = 0;
			int arr[] = new int[soldados];
			int arr1[] = new int[soldados];
			while (x < soldados) {
				arr[x] = t.nextInt();
				arr1[x] = t.nextInt();
				x++;
			}
			Arrays.sort(arr);
			Arrays.sort(arr1);
			long tiempo = ((arr[soldados - 1] + arr1[soldados - 1]) * arr[0]) / 2;
			o.println("Case " + c + " :" + tiempo);
			c++;
			soldados=t.nextInt();
		}
		o.close();
		t.close();
	}

}

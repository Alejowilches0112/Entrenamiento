package Fence_the_vegetables_fail;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner t;
	static PrintWriter pw;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t=new Scanner(System.in);
		pw=new PrintWriter(System.out);
		int P,V;
		int [] Xp,Yp,Xv,Yv;
		while(t.hasNext()) {
			P=t.nextInt();
			V=t.nextInt();
			Xp=new int[P];
			Yp=new int[P];
			Xv=new int[V];
			Yv=new int[V];
			for (int i = 0; i < Xp.length; i++) {
				Xp[i]=t.nextInt();
				Yp[i]=t.nextInt();
			}
			for (int i = 0; i < Yv.length; i++) {
				Xv[i]=t.nextInt();
				Yv[i]=t.nextInt();
			}
			
			
		}
	}
}

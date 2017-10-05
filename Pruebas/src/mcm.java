import java.util.*;

public class mcm {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int a,b,c;
		while (t.hasNext()) {
			a=t.nextInt();
			b=t.nextInt();
			c=t.nextInt();
			System.err.println(MCM(a, b, c));
			
		}
	}

	public static int MCM(int a, int b, int c) {
		int x = a;
		if (x > b) {
			x = b;
		}
		if (x > c) {
			x = c;
		}
		while (x % a != 0 || x % b != 0 || x % c != 0) {
			x++;
		}
		return x;
	}

}

package eleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String l = br.readLine();
		ArrayList<String> salida= new ArrayList<>();
		ArrayList<String> a= new ArrayList<>();
		int r=0;
		while (!l.equals("")) {
			
			LinkedList<Character> conjunto = new LinkedList<>();
			for (int i = 0; i < l.length(); i++) {
				conjunto.add(l.charAt(i));
			}
			/*a = permutar("", conjunto,salida);
			System.err.println(a.toString());*/
			salida.clear();
			r = per("", conjunto,salida);
			pw.println(r);
			r=0;
			l = br.readLine();
		}
		pw.close();
	}

	/*public static ArrayList<String> permutar(String a, LinkedList<Character> conjunto,ArrayList<String>salida) {
		if (conjunto.size() == 1) {
			//System.out.println(a + conjunto.get(0));
			if(salida.contains(a + conjunto.get(0))) {
				
			}else {
				salida.add(a + conjunto.get(0));
			}
		}
		for (int i = 0; i < conjunto.size(); i++) {
			//System.err.println(a);
			Character b = conjunto.remove(i);
			permutar(a + b, conjunto,salida);
			conjunto.add(i, b);
		}
		//System.out.println(salida.toString());
		return salida;
	}
	
	public static int monce(ArrayList<String> conjunto) {
		int j=0;
		String s;
		int sp;
		int si;
		int c=0;
		while (j<conjunto.size()) {
			int sum=-1;
			sp=0;
			si=0;
			s=conjunto.get(j);
			String []x=s.split("");
			for (int i = 0; i < x.length; i++) {
				if(i%2==0)sp+=Integer.parseInt(x[i]);
				else si=Integer.parseInt(x[i]);
			}
			sum=sp-si;
			if(sum==0 || sum%11==0) {
				c++;
				j++;
			}else {
				j++;
			}
		}
		int pro=c;
		c=0;
		return pro;
	}*/
	
	public static int per(String a,LinkedList<Character> c,ArrayList<String> r) {
		if (c.size() == 1) {
			//System.out.println(a + conjunto.get(0));
			if(r.contains(a + c.get(0))) {
				
			}else {
				if(m11(a + c.get(0))) {
					r.add(a + c.get(0));
				}
			}
		}
		for (int i = 0; i < c.size(); i++) {
			//System.err.println(a);
			Character b = c.remove(i);
			per(a + b, c,r);
			c.add(i, b);
		}
		//System.out.println(salida.toString());
		return r.size();
	}
	public static boolean m11(String a) {
		int sum=-1;
		int sp=0;
		int si=0;
		String []x=a.split("");
		for (int i = 0; i < x.length; i++) {
			if(i%2==0)sp+=Integer.parseInt(x[i]);
			else si=Integer.parseInt(x[i]);
		}
		sum=sp-si;
		if(sum == 0 || sum%11 == 0) {
			return true;
		}else {
			return false;
		}
	}

}

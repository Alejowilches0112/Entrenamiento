/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaTweets;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import twitter4j.GeoLocation;

/**
 *
 * @author Alejo
 */
public class file {
	public void escribir(Object id, Object tweet, GeoLocation ubicacion) throws IOException {
		FileWriter archivo = null;
		PrintWriter pw = null;
		try {
			archivo = new FileWriter("C:/Users/Alejo/Documents/BIG DATA/BigDataRedesSociales/src/Twitter.txt");
			pw = new PrintWriter(archivo);
			pw.println(id + " " + tweet + " " + ubicacion.toString() + "\n");
			pw.close();
		} catch (NullPointerException e) {
			System.err.print("no se pudo escribir en el fichero" + "\n");
		} finally {
			try {
				if (null != archivo) {
					archivo.close();
				}
			} catch (Exception e) {
				System.err.print(e.toString());
			}
		}
	}

	/*
	 * public static void main (String [] args) throws IOException{ file prueba =
	 * new file(); prueba.escribir("Hola", "Prueba", "localizacion"); }
	 */
}

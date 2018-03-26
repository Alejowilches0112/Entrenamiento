package pruebaTweets;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Alejo
 */

public class twit extends Thread {
	// variables
	private Twitter twit;
	private List<Status> busqueda;
	private String usuario;
	private String texto;
	private GeoLocation ubicacion;
	// Escribir Fichero
	file write;

	public ConfigurationBuilder config() throws TwitterException, IOException {
		ConfigurationBuilder ct = new ConfigurationBuilder();
		ct.setDebugEnabled(true).setOAuthConsumerKey("")
				.setOAuthConsumerSecret("")
				.setOAuthAccessToken("")
				.setOAuthAccessTokenSecret("");
		return ct;
	}

	public void buscar(String world) throws TwitterException, IOException, InterruptedException {
		twit = new TwitterFactory(config().build()).getInstance();
		FileWriter archivo = null;
		PrintWriter pw = null;
		// write = new file();
		try {
			Query buscar = new Query(world);
			QueryResult resultado;
			do {
				resultado = twit.search(buscar);
				busqueda = resultado.getTweets();
				for (Status tweet : busqueda) {
					usuario = tweet.getUser().getScreenName();
					texto = tweet.getText();
					ubicacion = tweet.getGeoLocation();
					archivo = new FileWriter("C:/Users/Alejo/Documents/BIG DATA/BigDataRedesSociales/src/Twitter1.txt");
					pw = new PrintWriter(archivo);
					pw.print(usuario + " " + texto + " " + ubicacion + "\n");
					System.out.println("@" + usuario + ":" + texto + ubicacion);
					// write.escribir(usuario, texto, ubicacion);
				}pw.close();
			} while ((buscar = resultado.nextQuery()) != null);
			this.dormir();
		} catch (TwitterException e) {
			System.err.println("Fallo busqueda de tweets" + e.getMessage());
			dormir();
		} catch (NullPointerException e) {
			System.err.println("Error desconocido");
		}
	}

	private void dormir() {
		try {
			Thread.sleep(604800 * 1000);
		} catch (Exception e) {
		}

	}
}

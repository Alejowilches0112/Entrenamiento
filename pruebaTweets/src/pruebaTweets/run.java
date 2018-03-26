package pruebaTweets;
import twitter4j.TwitterException;
import java.io.IOException;

/**
 *
 * @author Alejo
 */
public class run{
    /*
    * Declaracion de los objetos para la busqueda 
    */
    public static twit Twitter;
    
    public static void main(String[] args) throws TwitterException, IOException, InterruptedException {
        Twitter = new twit();
            Twitter.buscar("Gustavo Petro");
    }
}

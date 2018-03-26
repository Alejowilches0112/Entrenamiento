package pruebaTweets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Alejo
 */
public class BigDataRedesSociales {
    //public static twit Twitters;
    private static Twitter twit;
    private static List<Status> busqueda;
    public static void main(String[] args) throws TwitterException {
        //Configuración de Acceso al API
        ConfigurationBuilder ct= new ConfigurationBuilder();
        ct.setDebugEnabled(true)
                .setOAuthConsumerKey("UTO1qpbHGuT3JTqWd5KFOjk61")
                .setOAuthConsumerSecret("TH0fXIhkeA55KiBtZzMihTxbJaIA0XrL8eyBsmTHreN8Gy0CaS")
                .setOAuthAccessToken("162496007-CUuJHs97MjjZ5qTIi0lC30uGZWTXOnKovzjJ1JZV")
                .setOAuthAccessTokenSecret("JmrqRPaIH593T41JeuUz9ETg6HCo8mCnXhXn7ThqrTNWa");
        twit = new TwitterFactory(ct.build()).getInstance(); 
        String h="Petro";
        //Busqueda de Tweets
        try {
            Query buscar = new Query("petro");
            QueryResult resultado; 
            do{
                resultado = twit.search(buscar);
                busqueda = resultado.getTweets();
                for(Status tweet : busqueda ){
                    System.out.println("@" + tweet.getUser().getScreenName() + ":" +tweet.getText());
                }
            }while((buscar = resultado.nextQuery())!= null);
            System.exit(0);
        } catch (TwitterException e) {
            e.printStackTrace();
            System.err.println("Fallo busqeuda de tweets" + e.getMessage());
            System.exit(-1);
        }
    }
}


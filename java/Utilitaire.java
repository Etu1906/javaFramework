package model.util;

public class Utilitaire {
    static String base = "http://localhost:8081/framework/";

    public static String getUrl( String url ){
        int index =  url.indexOf(base); // trouver l'index de la chaîne "haha"
        if (index != -1) {
            String result = url.substring(index + base.length()); // extraire la sous-chaîne après "haha"
            // System.out.println(result); // imprimer la sous-chaîne résultante
            return result;
        } else {
            return "none";
        }
    }

}

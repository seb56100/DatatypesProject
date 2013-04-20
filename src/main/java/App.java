

import Adresse.Adresse;
import Adresse.Lieux;
import Adresse.Pays;
import Adresse.Ville;
import Temporel.Evenement;
import Temporel.Heure;
import Temporel.Intervalle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Adresse a = 
        a = new Adresse (2, Lieux.Rue, "Kervegan", new Ville("Nantes", 44000, new Pays("France", 10, 33)));
        
        System.out.println(a.toString());
    }
}

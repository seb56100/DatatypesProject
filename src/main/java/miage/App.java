package miage;

import miage.Adresse.Adresse;
import miage.Adresse.Lieux;
import miage.Adresse.Pays;
import miage.Adresse.Ville;
import miage.Temporel.Evenement;
import miage.Temporel.Heure;
import miage.Temporel.Intervalle;

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

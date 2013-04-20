package miage;

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
        Evenement ev = new Evenement("Forum MIAGE", "15/11/2012", "Faculté des sciences", new Intervalle(new Heure(9,0), new Heure(13,0)));
        System.out.println(ev.detailsEvenements());
    }
}

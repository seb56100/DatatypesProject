/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Temporel;

/**
 *
 * @author john.gdowe
 */
public class Heure {
    public Integer heures;
    public Integer minutes;
    public Integer secondes;

    public Heure(Integer heures, Integer minutes, Integer secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    public Heure(Integer heures, Integer minutes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = 0;
    }
    
    public Integer getHeures() {
        return heures;
    }

    public void setHeures(Integer heures) {
        this.heures = heures;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getSecondes() {
        return secondes;
    }

    public void setSecondes(Integer secondes) {
        this.secondes = secondes;
    }
    
    //  Donne l'heure sous forme d'une chaine
    public String donnerHeure() {
        return "Il est " + this.getHeures() + "h" + this.getMinutes() + "min" + this.getSecondes() + "s";
    }
}

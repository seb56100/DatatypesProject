/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Finance;

import java.util.Date;

/**
 *
 * @author john.gdowe
 */
public class TauxConversion
{
    private String nomTaux;
    private float taux;
    private String date;
    private Devise deviseIn;
    private Devise deviseOut;

    public TauxConversion(String nomTaux, float taux, String date, Devise deviseIn, Devise deviseOut) {
        this.nomTaux = nomTaux;
        this.taux = taux;
        this.date = date;
        this.deviseIn = deviseIn;
        this.deviseOut = deviseOut;
    }
    
    public String getNomTaux() {
        return nomTaux;
    }

    public void setNomTaux(String nomTaux) {
        this.nomTaux = nomTaux;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Devise getDeviseIn() {
        return deviseIn;
    }

    public void setDeviseIn(Devise deviseIn) {
        this.deviseIn = deviseIn;
    }

    public Devise getDeviseOut() {
        return deviseOut;
    }

    public void setDeviseOut(Devise deviseOut) {
        this.deviseOut = deviseOut;
    }
        
    //  Conversion d'un montant dans la devise d'entrée vers la devise de sortie
    public float convertirInOut(float montant){
        return montant * taux;   
    }
    
    //  Conversion d'un montant dans la devise de sortie vers la devise d'entrée
    public float convertirOutIn(float montant){
        return montant/taux;   
    }
}

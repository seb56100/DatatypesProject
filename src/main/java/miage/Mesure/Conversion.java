/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Mesure;

/**
 *
 * @author seb56100
 */
public class Conversion {
    
    private double echelle;
    private Unite base, resultat;
    
    
    public Conversion(double echelle, Unite base, Unite resultat){
        this.echelle = echelle;
        this.base = base;
        this.resultat = resultat;
    }

    public void setBase(Unite base) {
        this.base = base;
    }

    public void setResultat(Unite resultat) {
        this.resultat = resultat;
    }

    public Unite getBase() {
        return base;
    }

    public Unite getResultat() {
        return resultat;
    }
    
    
    public void convertir(){
        
    }

    public double getEchelle() {
        return echelle;
    }

    public void setEchelle(double echelle) {
        this.echelle = echelle;
    }
    
}

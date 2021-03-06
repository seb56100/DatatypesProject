/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mesure;

/**
 *
 * @author seb56100
 */
public class ConversionMesure {
    
    private double echelle;
    private Unite base, resultat;
        
    public ConversionMesure(double echelle, Unite base, Unite resultat){
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
    
    public double getEchelle() {
        return echelle;
    }

    public void setEchelle(double echelle) {
        this.echelle = echelle;
    }
    
    //  Conversion de l'unité de base en l'unité de résultat
    public double convertir(double quantite){
        return quantite * echelle;
    }
}

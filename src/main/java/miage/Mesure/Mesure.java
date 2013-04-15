/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.m1projects.datatypesproject.mesure;

/**
 *
 * @author seb56100
 */
public class Mesure {
    
    private int quantite;
    private Unite unite;
    
    public Mesure(int quantite, Unite unite){
        this.quantite = quantite;
        this.unite = unite;
    }

    public int getQuantite() {
        return quantite;
    }
    
    public Unite getUnite() {
        return unite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    public void setUnite(Unite unite) {
        this.unite = unite;
    }
    
    
}

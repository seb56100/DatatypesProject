/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.m1projects.datatypesproject.adresse;

/**
 *
 * @author seb56100
 */
public class Ville {
    private int indicateurTel;
    private Pays pays;
    
    public Ville(int indicateurTel, Pays pays){
        this.indicateurTel = indicateurTel;
        this.pays = pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Pays getPays() {
        return pays;
    }

    public void setIndicateurTel(int indicateurTel) {
        this.indicateurTel = indicateurTel;
    }

    public int getIndicateurTel() {
        return indicateurTel;
    }
    
    
    
}

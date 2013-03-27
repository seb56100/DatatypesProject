/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.m1projects.datatypesproject.adresse;

/**
 *
 * @author seb56100
 */
public class Pays {
    
    private int nbChiffreTel;
    private int indicateurTel;
    
    public Pays(int nbChiffreTel, int indicateurTel){
        this.indicateurTel = indicateurTel;
        this.nbChiffreTel = nbChiffreTel;
    }

    public int getNbChiffreTel() {
        return nbChiffreTel;
    }

    public int getIndicateurTel() {
        return indicateurTel;
    }

    public void setNbChiffreTel(int nbChiffreTel) {
        this.nbChiffreTel = nbChiffreTel;
    }

    public void setIndicateurTel(int indicateurTel) {
        this.indicateurTel = indicateurTel;
    }
    
    
}

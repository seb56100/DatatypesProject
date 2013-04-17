/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Adresse;

/**
 *
 * @author seb56100
 */
public class Pays {
    
    private String nom;
    private int nbChiffreTel;
    private int indicateurTel;
    
    public Pays(String nom, int nbChiffreTel, int indicateurTel){
        this.nom = nom;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adresse;

/**
 *
 * @author seb56100
 */
public class Pays {
    
    private String nom;
    private int nbChiffreTel;
    private int indicatifTel;
    
    public Pays(String nom, int nbChiffreTel, int indicatifTel){
        this.nom = nom;
        this.indicatifTel = indicatifTel;
        this.nbChiffreTel = nbChiffreTel;
    }

    public int getNbChiffreTel() {
        return nbChiffreTel;
    }

    public int getIndicatifTel() {
        return indicatifTel;
    }

    public void setNbChiffreTel(int nbChiffreTel) {
        this.nbChiffreTel = nbChiffreTel;
    }

    public void setIndicatifTel(int indicateurTel) {
        this.indicatifTel = indicatifTel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

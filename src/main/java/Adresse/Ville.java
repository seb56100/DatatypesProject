/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adresse;

/**
 *
 * @author seb56100
 */
public class Ville {
    
    private String nom;
    private int codePostal;
    private Pays pays;
    
    public Ville(String nom, int codePostal, Pays pays){
        this.nom = nom;
        this.codePostal = codePostal;
        this.pays = pays;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Pays getPays() {
        return pays;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public int getCodePostal() {
        return codePostal;
    }
}

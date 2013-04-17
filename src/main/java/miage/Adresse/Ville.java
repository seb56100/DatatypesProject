/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Adresse;

/**
 *
 * @author seb56100
 */
public class Ville {
    private String nom;
    private int indicateurTel;
    private Pays pays;
    
    public Ville(String nom, int indicateurTel, Pays pays){
        this.nom = nom;
        this.indicateurTel = indicateurTel;
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

    public void setIndicateurTel(int indicateurTel) {
        this.indicateurTel = indicateurTel;
    }

    public int getIndicateurTel() {
        return indicateurTel;
    }
    
    
    
}

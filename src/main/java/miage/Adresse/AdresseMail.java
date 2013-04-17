/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Adresse;

/**
 *
 * @author seb56100
 */
public class AdresseMail {
    
    private String nom;
    private String domaine;
    
    public AdresseMail (String nom , String domaine){
        this.nom = nom;
        this.domaine = domaine;
    }

    public String getNom() {
        return nom;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }
    
    
    
}

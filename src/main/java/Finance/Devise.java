/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Finance;

import Adresse.Pays;

/**
 *
 * @author john.gdowe
 */
public class Devise {

    private String nom;
    private Pays pays;

    public Devise(String nom, Pays pays) {
        this.nom = nom;
        this.pays = pays;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
}

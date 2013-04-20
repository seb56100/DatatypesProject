/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Finance;

import java.util.Date;

/**
 *
 * @author john.gdowe
 */
public class Devise {

    private String nom;
    private String pays;

    public Devise(String nom, String pays) {
        this.nom = nom;
        this.pays = pays;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Temporel;

import java.util.Date;

/**
 *
 * @author john.gdowe
 */
public class Evenement {
    private String nom;
    private Date date;
    private String lieu;
    private Intervalle intervalle;

    public Evenement() {
        this.nom = "Nom de l'événement à renseigner";
        this.date = new Date();
        this.lieu = "Lieu de l'événement à renseigner";
        this.intervalle = new Intervalle(new Heure(0,0), new Heure(0,0));
    }

    public Evenement(String nom, Date date, String lieu, Intervalle intervalle) {
        this.nom = nom;
        this.date = date;
        this.lieu = lieu;
        this.intervalle = intervalle;
    }
    
    public String getNom() {
        return nom;
    }

    public Date getDate() {
        return date;
    }

    public String getLieu() {
        return lieu;
    }

    public Intervalle getMyIntervalle() {
        return intervalle;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setMyIntervalle(Intervalle myIntervalle) {
        this.intervalle = myIntervalle;
    }
}

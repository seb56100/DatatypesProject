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
    private String date;
    private String lieu;
    private Intervalle intervalle;

    public Evenement(String nom, String date, String lieu, Intervalle intervalle) {
        this.nom = nom;
        this.date = date;
        this.lieu = lieu;
        this.intervalle = intervalle;
    }
    
    public String getNom() {
        return nom;
    }

    public String getDate() {
        return date;
    }

    public String getLieu() {
        return lieu;
    }

    public Intervalle getIntervalle() {
        return intervalle;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setIntervalle(Intervalle myIntervalle) {
        this.intervalle = myIntervalle;
    }
    
    //  Renvoie tous les détails de l'événement sous forme d'une chaine
    public String detailsEvenements() {
        return "L'événement '" + this.nom + "'  se déroulera le " + this.date
               + ". Lieu : " + this.lieu + ". Durée : " + this.intervalle.dureeEnMinutes() + " minutes.";
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporel;

/**
 *
 * @author john.gdowe
 */
public class Intervalle {
    public Heure hDebut;
    public Heure hFin;

    public Intervalle(Heure hDebut, Heure hFin) {
        this.hDebut = hDebut;
        this.hFin = hFin;
    }

    public Heure gethDebut() {
        return hDebut;
    }

    public void sethDebut(Heure hDebut) {
        this.hDebut = hDebut;
    }

    public Heure gethFin() {
        return hFin;
    }

    public void sethFin(Heure hFin) {
        this.hFin = hFin;
    }
    
    //  Retourne la durée en minutes de l'intervalle
    public int dureeEnMinutes() {
        return (Integer) (this.hFin.getHeures() * 60) + this.hFin.getMinutes() + (this.hFin.getSecondes()/60)
                - (this.hDebut.getHeures() * 60) + this.hDebut.getMinutes() + (this.hDebut.getSecondes()/60);
    }
}
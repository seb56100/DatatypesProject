package Ressource;

import Temporel.Intervalle;
import java.util.ArrayList;

public class Reservation {
    
    //  Durée de la reservation
    private Intervalle intervalleAllocation;
    
    //  Ressources concernées
    private ArrayList<Ressource> ressourcesConcernees;
    
    //  Intitulé de la reservation
    private String intitule;

    public Reservation(Intervalle intervalleAllocation, String intitule) {
        this.intervalleAllocation = intervalleAllocation;
        this.intitule = intitule;
        ressourcesConcernees = new ArrayList<Ressource>();
    }

    public Intervalle getIntervalleAllocation() {
        return intervalleAllocation;
    }

    public void setIntervalleAllocation(Intervalle intervalleAllocation) {
        this.intervalleAllocation = intervalleAllocation;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    
    public void ajouterRessource (Ressource r) {
        ressourcesConcernees.add(r);
    }
}
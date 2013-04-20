package Ressource;

public class Ressource {
    
    //  Disponibilité de la ressource
    public Boolean disponibilite;
    
    //  Nom de la ressource
    public String nom;

    public Ressource(String nom, Boolean disponibilite) {
        this.disponibilite = disponibilite;
        this.nom = nom;
    }

    public Boolean getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
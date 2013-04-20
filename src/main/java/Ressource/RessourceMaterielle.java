package Ressource;


public class RessourceMaterielle extends Ressource {
    private Boolean mobilite;

    public RessourceMaterielle(Boolean mobilite, Boolean disponibilite, String nom) {
        super(nom, disponibilite);
        this.mobilite = mobilite;
    }

    public Boolean getMobilite() {
        return mobilite;
    }

    public void setMobilite(Boolean mobilite) {
        this.mobilite = mobilite;
    }
}
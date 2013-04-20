package Ressource;

import Adresse.InfoPerso;

public class RessourceHumaine extends Ressource {
    private String fonction;
    private InfoPerso infos;    

    public RessourceHumaine(String fonction, InfoPerso infos, Boolean disponibilite, String nom) {
        super(nom, disponibilite);
        this.fonction = fonction;
        this.infos = infos;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public InfoPerso getInfos() {
        return infos;
    }

    public void setInfos(InfoPerso infos) {
        this.infos = infos;
    }
}
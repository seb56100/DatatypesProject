package miage.Temporel;

import java.util.Date;

public class Evenement {

  private String nom;
  private Date date;
  private String lieu;
  private Intervalle myIntervalle;

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
        return myIntervalle;
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
        this.myIntervalle = myIntervalle;
    }
}
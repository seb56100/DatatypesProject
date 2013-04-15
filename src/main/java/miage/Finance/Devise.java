package miage.Finance;

import java.util.Date;

public class Devise
{
    private String nom;
    private String pays;
    private Date date;
    
    public Devise(String nom, String pays, Date date)
    {
        this.nom = nom;
        this.pays = pays;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
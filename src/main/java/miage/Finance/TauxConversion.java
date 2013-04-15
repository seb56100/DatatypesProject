package miage.Finance;

import java.util.Date;

public class TauxConversion
{
    private String nomTaux;
    private Float taux;
    private Date date;
    private Devise deviseEntree;
    private Devise deviseSortie;

    public TauxConversion (String nomTaux, Float taux, Date date, Devise deviseEntree, Devise deviseSortie)
    {
        this.nomTaux = nomTaux;
        this.taux = taux;
        this.date = date;
        this.deviseEntree = deviseEntree;
        this.deviseSortie = deviseSortie;
    }

    public String getNomTaux() {
        return nomTaux;
    }

    public void setNomTaux(String nomTaux) {
        this.nomTaux = nomTaux;
    }

    public Float getTaux() {
        return taux;
    }

    public void setTaux(Float taux) {
        this.taux = taux;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Devise getDeviseEntree() {
        return deviseEntree;
    }

    public void setDeviseEntree(Devise deviseEntree) {
        this.deviseEntree = deviseEntree;
    }

    public Devise getDeviseSortie() {
        return deviseSortie;
    }

    public void setDeviseSortie(Devise deviseSortie) {
        this.deviseSortie = deviseSortie;
    }
}
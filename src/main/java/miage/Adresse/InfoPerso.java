/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Adresse;

/**
 *
 * @author seb56100
 */
public class InfoPerso {
    
    private Adresse adresse;
    private AdresseMail adresseMail;
    private Telephone telephone;
    
    public InfoPerso(Adresse adresse, AdresseMail adresseMail, Telephone telephone){
        this.adresse = adresse;
        this.adresseMail = adresseMail;
        this.telephone = telephone;
        
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public AdresseMail getAdresseMail() {
        return adresseMail;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setAdresseMail(AdresseMail adresseMail) {
        this.adresseMail = adresseMail;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
    
    
}

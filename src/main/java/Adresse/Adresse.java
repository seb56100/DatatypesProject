/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adresse;

/**
 *
 * @author seb56100
 */
public class Adresse {
    
    private int numero;
    private Lieux lieu;
    private String nom;
    private Ville ville;
    
    public Adresse(int numero, Lieux lieu, String nom, Ville ville) {
        this.numero = numero;
        this.lieu = lieu;
        this.nom = nom;
        this.ville = ville;
    }
    
    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public Ville getVille() {
        return ville;
    }

    public Lieux getLieu() {
        return lieu;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public void setLieu(Lieux lieu) {
        this.lieu = lieu;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    //  Retourne l'adresse sous forme d'une chaine
    @Override
    public String toString() {
        return this.numero + ", " + this.lieu + " " + this.nom + ", " +
               this.ville.getCodePostal() + " " + this.ville.getNom() + ", " +
               this.ville.getPays().getNom() + ".";
    }
}

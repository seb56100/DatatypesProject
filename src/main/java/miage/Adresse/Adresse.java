/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Adresse;

/**
 *
 * @author seb56100
 */
public class Adresse {
    
    private Lieux lieu;
    private int numero;
    private String nom;
    private Ville ville;
    
    public Adresse(Ville ville, int numero, Lieux lieu, String nom){
        this.lieu = lieu;
        this.numero = numero;
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
    
    
}

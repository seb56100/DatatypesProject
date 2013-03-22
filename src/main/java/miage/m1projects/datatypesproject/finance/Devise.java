package miage.m1projects.datatypesproject.finance;

import java.util.Date;
import java.util.Vector;

public class Devise {

  public String nom;
  public String pays;
  public Date date;

  public Vector  myTauxConversion;
    /**
   * 
   * @element-type TauxConversion
   */
  public Vector  deviseEntrée;
    /**
   * 
   * @element-type TauxConversion
   */
  public Vector  deviseSortie;

}
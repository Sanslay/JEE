package metier;

import java.io.Serializable;
import jpa.Cotisation;
import jpa.Employe;
import jpa.Indemnite;

public class FeuilleSalaire implements Serializable {
// champs privés

  private Employe employe;
  private Cotisation cotisation;
  private ElementsSalaire elementsSalaire;
// constructeurs

  public FeuilleSalaire() {
  }

  public FeuilleSalaire(Employe employe, Cotisation cotisation, ElementsSalaire elementsSalaire) {
    setEmploye(employe);
    setCotisation(cotisation);
    setElementsSalaire(elementsSalaire);
  }
// toString

  public String toString() {
    return "[" + employe + "," + cotisation + "," + elementsSalaire + "]";
  }

// accesseurs
  public void setEmploye(Employe employe) {
    this.employe = employe;
  }

  public void setCotisation(Cotisation cotisation) {
    this.cotisation = cotisation;
  }

  public void setElementsSalaire(ElementsSalaire elementsSalaire) {
    this.elementsSalaire = elementsSalaire;
  }

  public Employe getEmploye() {
    return employe;
  }

  public Cotisation getCotisation() {
    return cotisation;
  }

  public ElementsSalaire getElementsSalaire() {
    return elementsSalaire;
  }
}

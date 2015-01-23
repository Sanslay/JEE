package metier;

import java.io.Serializable;

public class ElementsSalaire implements Serializable {
// champs privés

  private double salaireBase;
  private double cotisationsSociales;
  private double indemnitesEntretien;
  private double indemnitesRepas;
  private double salaireNet;
// constructeurs

  public ElementsSalaire() {
  }

  public ElementsSalaire(double salaireBase, double cotisationsSociales,double indemnitesEntretien, double indemnitesRepas,double salaireNet) {
    setSalaireBase(salaireBase);
    setCotisationsSociales(cotisationsSociales);
    setIndemnitesEntretien(indemnitesEntretien);
    setIndemnitesRepas(indemnitesRepas);
    setSalaireNet(salaireNet);
  }
// toString

  @Override
  public String toString() {
    return "[salaire base=" + salaireBase + ",cotisations sociales=" + cotisationsSociales
            + ",indemnités d'entretien="
            + indemnitesEntretien + ",indemnités de repas=" + indemnitesRepas + ",salaire net="
            + salaireNet + "]";
  }

// getters et setters
  public double getSalaireBase() {
    return salaireBase;
  }

  public double getCotisationsSociales() {
    return cotisationsSociales;
  }

  public double getIndemnitesEntretien() {
    return indemnitesEntretien;
  }

  public double getIndemnitesRepas() {
    return indemnitesRepas;
  }

  public double getSalaireNet() {
    return salaireNet;
  }

  public void setSalaireBase(double salaireBase) {
    this.salaireBase = salaireBase;
  }

  public void setCotisationsSociales(double cotisationsSociales) {
    this.cotisationsSociales = cotisationsSociales;
  }

  public void setIndemnitesEntretien(double indemnitesEntretien) {
    this.indemnitesEntretien = indemnitesEntretien;
  }

  public void setIndemnitesRepas(double indemnitesRepas) {
    this.indemnitesRepas = indemnitesRepas;
  }

  public void setSalaireNet(double salaireNet) {
    this.salaireNet = salaireNet;
  }

}

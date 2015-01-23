package web.entities;

import metier.FeuilleSalaire;

public class Simulation {

  public Simulation() {
  }
// champs d'une simulation
  private Integer num = 0;
  private FeuilleSalaire feuilleSalaire;
  private String heuresTravaillées;
  private String joursTravaillés;
// constructeur

  public Simulation(Integer num, String heuresTravaillées, String joursTravaillés,
          FeuilleSalaire feuilleSalaire) {
    this.setNum(num);
    this.setFeuilleSalaire(feuilleSalaire);
    this.setHeuresTravaillées(heuresTravaillées);
    this.setJoursTravaillés(joursTravaillés);
  }

  public double getIndemnites() {
    return feuilleSalaire.getElementsSalaire().getIndemnitesEntretien()
            + feuilleSalaire.getElementsSalaire().getIndemnitesRepas();
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public FeuilleSalaire getFeuilleSalaire() {
    return feuilleSalaire;
  }

  public void setFeuilleSalaire(FeuilleSalaire feuilleSalaire) {
    this.feuilleSalaire = feuilleSalaire;
  }

  public String getHeuresTravaillées() {
    return heuresTravaillées;
  }

  public void setHeuresTravaillées(String heuresTravaillées) {
    this.heuresTravaillées = heuresTravaillées;
  }

  public String getJoursTravaillés() {
    return joursTravaillés;
  }

  public void setJoursTravaillés(String joursTravaillés) {
    this.joursTravaillés = joursTravaillés;
  }

}

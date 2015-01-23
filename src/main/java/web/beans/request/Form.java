package web.beans.request;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
import jpa.Employe;
import metier.FeuilleSalaire;
import web.beans.application.ApplicationData;
import web.beans.session.*;
import web.entities.Erreur;
import web.entities.Simulation;

@Named
@RequestScoped
public class Form {

  public Form() {

  }
// autres beans
  @Inject
  private ApplicationData applicationData;
  @Inject
  private SessionData sessionData;
// le modèle des vues
  private String comboEmployesValue = "";
  private String heuresTravaillées = "";
  private String joursTravaillés = "";
  
  private List<Erreur> erreurs = new ArrayList<Erreur>();
  private FeuilleSalaire feuilleSalaire;
  private List<Employe> listEmployes;
  //simulation
  private List<Simulation> simulations = new ArrayList<Simulation>();
  private Integer numSimulationToDelete =0;
  private Simulation simulation =new Simulation();
  

  // liste des employés
  public List<Employe> getEmployes() {
    return applicationData.getMetier().findAllEmployes();
  }
// action du menu

  public String faireSimulation() {
    try {

      feuilleSalaire = applicationData.getMetier().calculerFeuilleSalaire(getComboEmployesValue(), Double.parseDouble(getHeuresTravaillées()), (int) Double.parseDouble(getJoursTravaillés()));
      sessionData.setMenuEnregistrerSimulationIsRendered(true);
      sessionData.setMenuFaireSimulationIsRendered(false);
      //On stock dans l'objet simulation
      simulation =new Simulation();
      simulation.setFeuilleSalaire(feuilleSalaire);
      simulation.setHeuresTravaillées(heuresTravaillées);
      simulation.setJoursTravaillés(joursTravaillés);
      
      
       sessionData.setSimulation(simulation);
       simulations = sessionData.getSimulations();
      simulations.add(sessionData.getSimulation());
      
      System.out.println(numSimulationToDelete);
      return "simulation";

    } catch (Throwable e) {

      erreurs.clear();
     
     Throwable th =e;
     erreurs = new ArrayList<Erreur>();
      while(th !=null)
      {
        erreurs.add(new Erreur(th.getClass().getName(),th.getMessage()));
        th =th.getCause();
      }
            
      return "erreur";
      
    }

  }
  public String enregistrerSimulation() {
    
    //Tous est fait dans faire simulation

 
    return "simulation2";
  }

  public String effacerSimulation() {
      comboEmployesValue="";
  heuresTravaillées = "";
  joursTravaillés = "";
  sessionData.setMenuEnregistrerSimulationIsRendered(false);
   sessionData.setMenuFaireSimulationIsRendered(true);
    return "saisie";
    //return null;
  }

  public String voirSimulations() {
    return null;
  }

  public String retourSimulateur() {
    return null;
  }

  public String terminerSession() {
    return null;
  }

  public String retirerSimulation() {
    return null;
  }

  private void razFormulaire() {

  

  }

// getters et setters
  public ApplicationData getApplicationData() {
    return applicationData;
  }

  public void setApplicationData(ApplicationData applicationData) {
    this.applicationData = applicationData;
  }

  public SessionData getSessionData() {
    return sessionData;
  }

  public void setSessionData(SessionData sessionData) {
    this.sessionData = sessionData;
  }

  public String getComboEmployesValue() {
    return comboEmployesValue;
  }

  public void setComboEmployesValue(String comboEmployesValue) {
    this.comboEmployesValue = comboEmployesValue;
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

  public Integer getNumSimulationToDelete() {
    return numSimulationToDelete;
  }

  public void setNumSimulationToDelete(Integer numSimulationToDelete) {
    this.numSimulationToDelete = numSimulationToDelete;
  }

  public List<Erreur> getErreurs() {
    return erreurs;
  }

  public void setErreurs(List<Erreur> erreurs) {
    this.erreurs = erreurs;
  }

  public FeuilleSalaire getFeuilleSalaire() {
    return feuilleSalaire;
  }

  public void setFeuilleSalaire(FeuilleSalaire feuilleSalaire) {
    this.feuilleSalaire = feuilleSalaire;
  }

  public SelectItem[] getSelectOneListbox1Items() {
  
    return getItems();
  }

  private SelectItem[] getItems() {
    listEmployes = new ArrayList<Employe>();
    listEmployes = applicationData.getMetier().findAllEmployes();
    //System.out.println(listEmployes);
    SelectItem[] items = new SelectItem[listEmployes.size()];

    for (int i = 0; i < listEmployes.size(); i++) {
      items[i] = new SelectItem(listEmployes.get(i).getSS(), listEmployes.get(i).getPrenom() + listEmployes.get(i).getNom());
    }
    return items;
  }

  public List<Employe> getListEmployes() {
    return listEmployes;
  }

  public void setListEmployes(List<Employe> listEmployes) {
    this.listEmployes = listEmployes;
  }

}

package web.beans.session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

import javax.inject.Inject;
import javax.inject.Named;
import web.beans.application.ApplicationData;
import web.entities.Simulation;

@Named
@SessionScoped
public class SessionData implements Serializable {
// application

  @Inject
  private ApplicationData applicationData;
// simulations
  private List<Simulation> simulations = new ArrayList<Simulation>();//enregristre la simulation coutante dans une liste de simulation maintenue dans une classe SessionData
  private int numDerniereSimulation = 0;//Id de la simulation +1 a chaque simulation
  private Simulation simulation;
// menus
  private boolean menuFaireSimulationIsRendered = true;
  private boolean menuEffacerSimulationIsRendered = true;
  private boolean menuEnregistrerSimulationIsRendered;
  private boolean menuVoirSimulationsIsRendered;
  private boolean menuRetourSimulateurIsRendered;
  private boolean menuTerminerSessionIsRendered = true;
// locale
  private String locale = "fr_FR";
// constructeur

  public SessionData() {
  }

  @PostConstruct
  public void init() {
// log
    if (applicationData.isLogsEnabled()) {

      applicationData.getLogger().info("SessionData");
    }
  }
// gestion des menus

  public void setMenu(boolean menuFaireSimulationIsRendered, boolean menuEnregistrerSimulationIsRendered, boolean menuEffacerSimulationIsRendered, boolean menuVoirSimulationsIsRendered, boolean menuRetourSimulateurIsRendered, boolean menuTerminerSessionIsRendered) {
    this.setMenuFaireSimulationIsRendered(menuFaireSimulationIsRendered);
    this.setMenuEnregistrerSimulationIsRendered(menuEnregistrerSimulationIsRendered);
    this.setMenuVoirSimulationsIsRendered(menuVoirSimulationsIsRendered);
    this.setMenuEffacerSimulationIsRendered(menuEffacerSimulationIsRendered);
    this.setMenuRetourSimulateurIsRendered(menuRetourSimulateurIsRendered);
    this.setMenuTerminerSessionIsRendered(menuTerminerSessionIsRendered);
  }

// getters et setters
  public ApplicationData getApplicationData() {
    return applicationData;
  }

  public void setApplicationData(ApplicationData applicationData) {
    this.applicationData = applicationData;
  }

  public List<Simulation> getSimulations() {
    return simulations;
  }

  public void setSimulations(List<Simulation> simulations) {
    this.simulations = simulations;
  }

  public int getNumDerniereSimulation() {
    return numDerniereSimulation;
  }

  public void setNumDerniereSimulation(int numDerniereSimulation) {
    this.numDerniereSimulation = numDerniereSimulation;
  }

  public Simulation getSimulation() {
    return simulation;
  }

  public void setSimulation(Simulation simulation) {
    this.simulation = simulation;
  }

  public boolean isMenuFaireSimulationIsRendered() {
    return menuFaireSimulationIsRendered;
  }

  public void setMenuFaireSimulationIsRendered(boolean menuFaireSimulationIsRendered) {
    this.menuFaireSimulationIsRendered = menuFaireSimulationIsRendered;
  }

  public boolean isMenuEffacerSimulationIsRendered() {
    return menuEffacerSimulationIsRendered;
  }

  public void setMenuEffacerSimulationIsRendered(boolean menuEffacerSimulationIsRendered) {
    this.menuEffacerSimulationIsRendered = menuEffacerSimulationIsRendered;
  }

  public boolean isMenuEnregistrerSimulationIsRendered() {
    return menuEnregistrerSimulationIsRendered;
  }

  public void setMenuEnregistrerSimulationIsRendered(boolean menuEnregistrerSimulationIsRendered) {
    this.menuEnregistrerSimulationIsRendered = menuEnregistrerSimulationIsRendered;
  }

  public boolean isMenuVoirSimulationsIsRendered() {
    return menuVoirSimulationsIsRendered;
  }

  public void setMenuVoirSimulationsIsRendered(boolean menuVoirSimulationsIsRendered) {
    this.menuVoirSimulationsIsRendered = menuVoirSimulationsIsRendered;
  }

  public boolean isMenuRetourSimulateurIsRendered() {
    return menuRetourSimulateurIsRendered;
  }

  public void setMenuRetourSimulateurIsRendered(boolean menuRetourSimulateurIsRendered) {
    this.menuRetourSimulateurIsRendered = menuRetourSimulateurIsRendered;
  }

  public boolean isMenuTerminerSessionIsRendered() {
    return menuTerminerSessionIsRendered;
  }

  public void setMenuTerminerSessionIsRendered(boolean menuTerminerSessionIsRendered) {
    this.menuTerminerSessionIsRendered = menuTerminerSessionIsRendered;
  }

  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


}

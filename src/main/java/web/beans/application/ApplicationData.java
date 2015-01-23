package web.beans.application;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import metier.IMetierLocal;
import metier.Metier;

@Named
@ApplicationScoped
public class ApplicationData implements Serializable {
// couche métier

  private IMetierLocal metier = new Metier();
// logger
  private boolean logsEnabled = true;

  private final Logger logger = Logger.getLogger("pam");

  public ApplicationData() {

  }

  @PostConstruct
  public void init() {
// log
    if (isLogsEnabled()) {
      logger.info("ApplicationData");
    }
  }

// getters et setters
  public IMetierLocal getMetier() {
    return metier;
  }

  public void setMetier(IMetierLocal metier) {
    this.metier = metier;
  }

  public boolean isLogsEnabled() {
    return logsEnabled;
  }

  public void setLogsEnabled(boolean logsEnabled) {
    this.logsEnabled = logsEnabled;
  }

  public Logger getLogger() {
    return logger;
  }



}

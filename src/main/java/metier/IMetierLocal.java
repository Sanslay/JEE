package metier;

import java.util.List;
import javax.ejb.Local;
import jpa.Employe;

@Local
public interface IMetierLocal {
// obtenir la feuille de salaire

  FeuilleSalaire calculerFeuilleSalaire(String SS, double nbHeuresTravaillées, int nbJoursTravaillés);
// liste des employés

  List<Employe> findAllEmployes();
}

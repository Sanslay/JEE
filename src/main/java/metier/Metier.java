package metier;


import exception.PamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jpa.Cotisation;
import jpa.Employe;
import jpa.Indemnite;


public class Metier implements IMetierLocal, Serializable {
// dictionnaire des employes indexé par le n° SS

  private Map<String, Employe> hashEmployes = new HashMap<String, Employe>();
// liste des employés
  private List<Employe> listEmployes;
// obtenir la feuille de salaire
  

  public FeuilleSalaire calculerFeuilleSalaire(String SS,
          double nbHeuresTravaillées, int nbJoursTravaillés) {

// on récupère l'employé de n° SS
    Employe e = hashEmployes.get(SS);
    //System.out.println(e.getSS());
    // on rend une exception si l'employé n'existe pas
if(e==null){
throw new PamException(String.format("L'employé de n° SS [%s] n'existe pas",SS),1);
}
// on rend une feuille de salaire fictive
return new FeuilleSalaire(e,new Cotisation(3.49,6.15,9.39,7.88),new ElementsSalaire(100,100,100,100,100));
}


  public List<Employe> findAllEmployes() {
 
    if (listEmployes == null) {

// on crée une liste de deux employés
      listEmployes = new ArrayList<Employe>();

      listEmployes.add(new Employe("Marie","254104940426058","5 rue desoiseaux","49203","St Corentin", "Jouveinal" ,new Indemnite(2.1,3.10,2,3,15)));
      listEmployes.add(new Employe("Laverti", "260124402111742","49014" , "La brûlerie","StMarcel","Justine",new Indemnite(1,1.93,2,3,12)));
// dictionnaire des employes indexé par le n° SS
for (Employe e : listEmployes) {
        hashEmployes.put(e.getSS(), e);
      }
      listEmployes.add(new Employe("X", "236547895365236","49014" , "La brûlerie","StMarcel","Y",new Indemnite(1,1.93,2,3,12)));

    }
// on rend la liste des employés
    return listEmployes;
  }
}
 

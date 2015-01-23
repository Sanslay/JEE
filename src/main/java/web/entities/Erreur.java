/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.entities;

public class Erreur {

  public Erreur() {
  }
// champ
  private String classe;
  private String message;
// constructeur

  public Erreur(String classe, String message) {
    this.setClasse(classe);
    this.message = message;
  }

  public String getClasse() {
    return classe;
  }

  public void setClasse(String classe) {
    this.classe = classe;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}

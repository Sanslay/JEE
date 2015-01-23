/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author usrlocal
 */
@Entity
@Table(name = "employes")
@NamedQueries({
  @NamedQuery(name = "Employe.findAll", query = "SELECT e FROM Employe e")})
public class Employe implements Serializable {
  //private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "ID")
  private Long id;
  @Basic(optional = false)
  @Column(name = "PRENOM")
  private String prenom;
  @Basic(optional = false)
  @Column(name = "SS")
  private String ss;
  @Basic(optional = false)
  @Column(name = "ADRESSE")
  private String adresse;
  @Basic(optional = false)
  @Column(name = "CP")
  private String cp;
  @Basic(optional = false)
  @Column(name = "VILLE")
  private String ville;
  @Basic(optional = false)
  @Column(name = "NOM")
  private String nom;
  @Basic(optional = false)
  @Column(name = "VERSION")
  private int version;
  @JoinColumn(name = "INDEMNITE_ID", referencedColumnName = "ID")
  @ManyToOne(optional = false)
  private Indemnite indemniteId;

  public Employe() {
  }

  public Employe(Long id) {
    this.id = id;
  }

  public Employe(Long id, String prenom, String ss, String adresse, String cp, String ville, String nom, int version) {
    this.id = id;
    this.prenom = prenom;
    this.ss = ss;
    this.adresse = adresse;
    this.cp = cp;
    this.ville = ville;
    this.nom = nom;
    this.version = version;
  }
  public Employe(String prenom, String ss, String adresse, String cp, String ville, String nom,Indemnite indemnite ) {
 
    this.prenom = prenom;
    this.ss = ss;
    this.adresse = adresse;
    this.cp = cp;
    this.ville = ville;
    this.nom = nom;
    this.indemniteId= indemnite;
  }
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getSS() {
    return ss;
  }

  public void setSS(String ss) {
    this.ss = ss;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  public Indemnite getIndemniteId() {
    return indemniteId;
  }

  public void setIndemniteId(Indemnite indemniteId) {
    this.indemniteId = indemniteId;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Employe)) {
      return false;
    }
    Employe other = (Employe) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "jpa.Employe[ id=" + id + " ]";
  }
  
}

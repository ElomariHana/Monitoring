package org.ee.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Domaine implements Serializable {
	
	@Id
	@GeneratedValue
	private Long idDomaine;
	private String nom;



	
	
	public Long getIdDomaine() {
		return idDomaine;
	}
	public void setIdDomaine(Long idDomaine) {
		this.idDomaine = idDomaine;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public Domaine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Domaine(String nom) {
		super();
		this.nom = nom;
		}
	

}

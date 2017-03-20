package Metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="compte") //pour specifier que le msg xml qui sera générer représentant un compte s'appelle compte
@XmlAccessorType(XmlAccessType.FIELD) //pour prendre en compte les annotation sur les attributs et ne pas devoir les mettre sur les getter
public class Compte implements Serializable{
	private Long code;
	private double solde;
	
	//Normalement l'annotation doit etre sur le getter, pour ne pas envoyer l'info au client
	//Pour pouvoir la mettre sur l'attribut, il faut ajouter @XmlAccessorType
	@XmlTransient 
	private Date datecreation;
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public Compte(Long code, double solde, Date datecreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.datecreation = datecreation;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

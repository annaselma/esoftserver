package ma.esoftech.esoftrade.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Fetch;
@Entity
@Table(name="Person")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public  abstract class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Person_ID", nullable=false, unique= true )
      private int person_Id;
	@Column(name="NAME",nullable= false, length= 255)
	private String name;
	public int getPerson_Id() {
		return person_Id;
	}
	public void setPerson_Id(int person_Id) {
		this.person_Id = person_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getCivility() {
		return civility;
	}
	public void setCivility(String civility) {
		this.civility = civility;
	}
	public String getDateN() {
		return dateN;
	}
	public void setDateN(String dateN) {
		this.dateN = dateN;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelephone_pro() {
		return telephone_pro;
	}
	public void setTelephone_pro(String telephone_pro) {
		this.telephone_pro = telephone_pro;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	@Column(name="FIRST_NAME",nullable=false,length=255)	
	private String firstName;
	@Column(name="Matricule", nullable=false, length=255)
	private String matricule;
	@Column(name="CIVILITY",nullable=false,length=255)
	private String civility;
	@Column(name="DateN",nullable=false,length=255)
	private String dateN;
	@Column(name="ADRESSE",nullable=false,length=255)
	private String adresse;
	@Column(name="TEL",nullable=false,length=255)
	private String telephone;
	@Column(name="TELPRO",nullable=false,length=255)
	private String telephone_pro;
	@Column(name="FAX",nullable=false,length=255)
	private String fax;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SELECT)
	  @CollectionTable(name="EMAIL", joinColumns=@JoinColumn(name="Person_ID"))
	  @Column(name="EMAIL")
	private Set<String> email;
	public Set<String>  getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public Person (){}
	
}

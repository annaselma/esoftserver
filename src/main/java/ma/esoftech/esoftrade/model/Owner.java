package ma.esoftech.esoftrade.model;

import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OWNER")
public class Owner extends Person {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="OWNER_ID", nullable=false, length=255)
	private int owner_id;
	@Column(name="DISABLE", nullable=false, length=255)
	private Boolean disable;
	@Column(name="LOGIN" ,length=255 , nullable=false, unique=true)
	private String login;
	@Column(name="PASSWD" ,length=255 , nullable=false)
	private String passwd;
	
	
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public Boolean getDisable() {
		return disable;
	}
	public void setDisable(Boolean disable) {
		this.disable = disable;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Owner (){}
}

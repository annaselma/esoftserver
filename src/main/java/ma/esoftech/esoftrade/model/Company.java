package ma.esoftech.esoftrade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPANY")
public class Company {
@Id
@GeneratedValue
@Column(name="COMPANY_ID" ,nullable=false, unique=true)
private int company_id;
@Column(name="TYPE",nullable=false)
private String type;
}

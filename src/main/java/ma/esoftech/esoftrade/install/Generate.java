package ma.esoftech.esoftrade.install;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

public class Generate {
public static void main (String[]args){
	Configuration cfg= new Configuration().configure("hibernate2.cfg.xml");
	SchemaUpdate sh= new SchemaUpdate(cfg);	
	sh.execute(true, true);}
}

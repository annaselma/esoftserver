package ma.esoftech.esoftrade.Run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
@Service
public class Run {

	/**
	 * @param args
	 */
	
@Autowired
Publisher publisher;
	
	public static void main(String[] args) {
	
		Run run =(Run)new ClassPathXmlApplicationContext("Application.xml").getBean("run");
		try {
			run.run();
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Run(){
	}
	public  void run() {
		
			
			publisher.start();

	}
}

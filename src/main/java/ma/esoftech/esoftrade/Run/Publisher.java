package ma.esoftech.esoftrade.Run;

import javax.xml.ws.Endpoint;

import ma.esoftech.esoftrade.Service.IUserService;
import ma.esoftech.esoftrade.wsDelegate.UserServiceWS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Publisher {


@Autowired
private IUserService userService;

@Value("${webService.host}")
private String host;
@Value("${webService.port}")
private String port;

public Publisher(){};

     public void start() {
		Endpoint.publish("http://"+host+":"+port+"/userService",new UserServiceWS(userService));
	}

}

package ma.esoftech.esoftrade.wsDelegate;

import java.util.List;

import javax.jws.WebService;

import ma.esoftech.esoftrade.Service.IUserService;
import ma.esoftech.esoftrade.model.User;

@WebService(targetNamespace="User.Service.esoftrade.esoftech.ma",name="UserService",endpointInterface="ma.esoftech.esoftrade.wsDelegate.UserServiceWS")
public class UserServiceWS implements IUserService {

	IUserService userService;
	 public UserServiceWS(IUserService userService) {
		// TODO Auto-generated constructor stub
	this.userService=userService;
	 }
	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userService.getUserList();
	}

}

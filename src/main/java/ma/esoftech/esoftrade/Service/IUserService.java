package ma.esoftech.esoftrade.Service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import ma.esoftech.esoftrade.model.User;

@WebService
@SOAPBinding(style= Style.RPC)
public interface IUserService {
@WebMethod
public List<User>getUserList();
}

package ma.esoftech.esoftrade.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.esoftech.esoftrade.Dao.IUserDao;
import ma.esoftech.esoftrade.Service.IUserService;
import ma.esoftech.esoftrade.model.User;
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;
	@Override
	@Transactional(readOnly=true)
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userDao.getUser();
	}

}

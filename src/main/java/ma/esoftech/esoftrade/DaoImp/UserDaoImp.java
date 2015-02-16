package ma.esoftech.esoftrade.DaoImp;

import java.nio.channels.SeekableByteChannel;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.QueryException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttributes;

import ma.esoftech.esoftrade.Dao.IUserDao;
import ma.esoftech.esoftrade.model.User;
@Repository
public class UserDaoImp implements IUserDao {
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
	@Override
	public List<User> getUser() {
		// TODO 
		session=sessionFactory.getCurrentSession();
		Query query= session.createQuery("select user from User as user ");
		
		return query.list();
	}
	
	
}

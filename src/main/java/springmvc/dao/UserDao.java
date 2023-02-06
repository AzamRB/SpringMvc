package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplet;
	
	@Transactional
	public int saveUser(User user) {
		Integer id = (Integer) this.hibernateTemplet.save(user);
		return id;
	}

	public HibernateTemplate getHibernateTemplet() {
		return hibernateTemplet;
	}

	public void setHibernateTemplet(HibernateTemplate hibernateTemplet) {
		this.hibernateTemplet = hibernateTemplet;
	}
	

}

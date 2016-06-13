package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.entities.User;

@Qualifier(value="userDao")
@Repository
public class UserDao implements UserDaoInt{

    @PersistenceContext
    private EntityManager entityManager;

	@Override
	@Transactional
	public User getById(Integer id) {
		User user = entityManager.find(User.class, id);
		return user;
	}

}

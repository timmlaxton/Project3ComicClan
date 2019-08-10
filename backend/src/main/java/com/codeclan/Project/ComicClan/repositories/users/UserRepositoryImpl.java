package com.codeclan.Project.ComicClan.repositories.users;

import com.codeclan.Project.ComicClan.models.User;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class UserRepositoryImpl implements UserRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<User> allUsers() {
        List<User> users = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(User.class);
            users = cr.list();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }

        return users;
    }
}

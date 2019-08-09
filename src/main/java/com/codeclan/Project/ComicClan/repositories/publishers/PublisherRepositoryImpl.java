package com.codeclan.Project.ComicClan.repositories.publishers;

import com.codeclan.Project.ComicClan.models.Publisher;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class PublisherRepositoryImpl implements PublisherRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Publisher> allPublishers(){
        List<Publisher> publishers = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Publisher.class);
            publishers = cr.list();
        }catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return publishers;
    }

}

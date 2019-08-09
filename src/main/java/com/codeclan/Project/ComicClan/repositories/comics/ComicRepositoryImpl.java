package com.codeclan.Project.ComicClan.repositories.comics;

import com.codeclan.Project.ComicClan.models.Comic;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class ComicRepositoryImpl implements ComicRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Comic> allComics(){
        List<Comic> comics = null;
        Session session = entityManager.unwrap(Session.class);

        try  {
            Criteria cr = session.createCriteria(Comic.class);
            comics = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }


        return comics;
    }
}

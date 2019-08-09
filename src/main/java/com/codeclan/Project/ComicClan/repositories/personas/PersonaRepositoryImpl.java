package com.codeclan.Project.ComicClan.repositories.personas;

import com.codeclan.Project.ComicClan.models.Persona;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class PersonaRepositoryImpl implements PersonaRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Persona> allPersonas() {
        List<Persona> personas = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Persona.class);
            personas = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return personas;
    }
}

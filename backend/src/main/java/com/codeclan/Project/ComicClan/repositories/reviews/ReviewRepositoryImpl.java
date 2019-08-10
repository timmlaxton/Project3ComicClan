package com.codeclan.Project.ComicClan.repositories.reviews;

import com.codeclan.Project.ComicClan.models.Review;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class ReviewRepositoryImpl implements ReviewRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Review> allReviews() {
        List<Review> reviews = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Review.class);
            reviews = cr.list();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }

        return reviews;

    }
}

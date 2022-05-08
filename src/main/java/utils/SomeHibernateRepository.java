package utils;

import org.hibernate.SessionFactory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

public class SomeHibernateRepository {

    @PersistenceUnit
    private EntityManagerFactory emf;

    protected SessionFactory getSessionFactory() {
        return emf.unwrap(SessionFactory.class);
    }

}

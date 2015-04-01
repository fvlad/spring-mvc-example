package example.dao.impl;

import example.dao.ContactDao;
import example.domain.Contact;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Vlad Fefelov
 */
@Repository
public class ContactDaoImpl implements ContactDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Contact contact) {
        entityManager.persist(contact);
    }

    @Override
    public Collection<Contact> getAll() {
        return entityManager.createQuery("from Contact", Contact.class).getResultList();
    }

    @Override
    public void remove(Integer contactId) {
        Contact contact = entityManager.find(Contact.class, contactId);
        if (null != contact) {
            entityManager.remove(contact);
        }
    }
}

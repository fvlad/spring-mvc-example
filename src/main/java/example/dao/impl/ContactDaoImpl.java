package example.dao.impl;

import example.dao.ContactDao;
import example.domain.Contact;
import java.util.Collection;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Vlad Fefelov
 */
@Repository
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Collection<Contact> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    @Override
    public void remove(Integer contactId) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(Contact.class, contactId);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }
    }
}

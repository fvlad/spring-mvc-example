package example.service.impl;

import example.dao.ContactDao;
import example.domain.Contact;
import example.service.ContactService;
import java.util.Collection;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Vlad Fefelov
 */
@Transactional
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    public Collection<Contact> getAll() {
        return contactDao.getAll();
    }

    @Override
    public void add(Contact contact) {
        contactDao.add(contact);
    }

    @Override
    public void remove(Integer contactId) {
        contactDao.remove(contactId);
    }
}

package example.service.impl;

import example.dao.ContactRepository;
import example.domain.Contact;
import example.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

/**
 * @author Vlad Fefelov
 */
@Transactional
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Collection<Contact> getAll() {
        return contactRepository.findAll();
    }

    @Override
    public void add(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void remove(Integer contactId) {
        contactRepository.delete(contactId);
    }
}

package example.service;

import example.domain.Contact;
import java.util.Collection;

/**
 * @author Vlad Fefelov
 */
public interface ContactService {

    Collection<Contact> getAll();

    void add(Contact contact);

    void remove(Integer contactId);
}

package example.dao;

import example.domain.Contact;
import java.util.Collection;

/**
 * @author Vlad Fefelov
 */
public interface ContactDao {

    Collection<Contact> getAll();

    void add(Contact contact);

    void remove(Integer contactId);
}

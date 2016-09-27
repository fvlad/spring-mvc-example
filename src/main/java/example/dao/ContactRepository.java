package example.dao;

import example.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vlad Fefelov
 */
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}

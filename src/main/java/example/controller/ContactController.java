package example.controller;

import example.domain.Contact;
import example.service.ContactService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vlad Fefelov
 */
@RestController
@RequestMapping("contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Contact> getAll() {
        return contactService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Collection<Contact> add(@RequestBody Contact contact){
        contactService.add(contact);
        return getAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public Collection<Contact> remove(@RequestParam Integer contactId) {
        contactService.remove(contactId);
        return getAll();
    }

}

package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Contact;

@Projection(types = Contact.class)
public interface CustomContact {
    Integer getId();
    String getEmail();
    String getPhoneNumber();
}

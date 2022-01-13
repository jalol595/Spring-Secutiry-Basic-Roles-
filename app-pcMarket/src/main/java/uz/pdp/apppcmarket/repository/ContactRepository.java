package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Contact;
import uz.pdp.apppcmarket.projection.CustomContact;

@RepositoryRestResource(path = "contact", excerptProjection = CustomContact.class)
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}

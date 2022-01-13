package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Users;

@Projection(types = Users.class)
public interface CustomUsers {
    Integer getId();

    String getFullName();

    String getPhoneNumber();
}

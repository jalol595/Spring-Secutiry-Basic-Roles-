package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.apppcmarket.entity.DiliveryAndPay;


@Projection(types = DiliveryAndPay.class)
public interface CustomDiliveryAndPay extends CustomDiliveryAndPayi {
    Integer getId();

    String getFullName();

    String getEmail();


}

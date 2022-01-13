package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Product;
import uz.pdp.apppcmarket.entity.Supplier;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getFullName();

    String getEmail();

    Integer getProductId();
}


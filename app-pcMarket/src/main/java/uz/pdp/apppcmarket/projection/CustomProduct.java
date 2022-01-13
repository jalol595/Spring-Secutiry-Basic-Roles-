package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    String getModel();

    double getPrice();

    String getMaker();

    String getType();

    Integer getCategoryId();
}

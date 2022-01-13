package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.projection.CustomDiliveryAndPay;

@RepositoryRestResource(path = "diliveryandpay", excerptProjection = CustomDiliveryAndPay.class)
public interface DiliveryAndPay extends JpaRepository<uz.pdp.apppcmarket.entity.DiliveryAndPay, Integer>{
}

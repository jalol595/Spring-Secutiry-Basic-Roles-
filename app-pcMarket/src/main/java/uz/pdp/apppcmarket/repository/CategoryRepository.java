package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.projection.CustomCategory;

@RepositoryRestResource(path = "category", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

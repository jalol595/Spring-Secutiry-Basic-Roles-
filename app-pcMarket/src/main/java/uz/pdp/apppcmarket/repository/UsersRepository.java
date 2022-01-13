package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Users;
import uz.pdp.apppcmarket.projection.CustomUsers;

@RepositoryRestResource(path = "users", excerptProjection = CustomUsers.class)
public interface UsersRepository extends JpaRepository<Users, Integer> {
}

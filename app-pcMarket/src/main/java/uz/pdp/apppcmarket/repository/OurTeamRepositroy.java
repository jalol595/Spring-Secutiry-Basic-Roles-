package uz.pdp.apppcmarket.repository;

import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.OurTeam;
import uz.pdp.apppcmarket.projection.CustomOurTeam;

@RepositoryRestResource(path = "ourteam", excerptProjection = CustomOurTeam.class)
public interface OurTeamRepositroy extends JpaRepository<OurTeam, Integer> {
}

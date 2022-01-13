package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.OurTeam;

@Projection(types = OurTeam.class)
public interface CustomOurTeam {
    Integer getId();
    String getFullName();
    String getPosition();
}

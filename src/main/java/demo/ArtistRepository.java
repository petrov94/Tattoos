package demo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository <Artist, Integer> {

}

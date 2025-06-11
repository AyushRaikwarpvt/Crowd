package ITCrowd.Basics.Reporistroy;

import ITCrowd.Basics.Model.Employe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Empolye_Repository  extends CrudRepository<Employe, Integer> {


}

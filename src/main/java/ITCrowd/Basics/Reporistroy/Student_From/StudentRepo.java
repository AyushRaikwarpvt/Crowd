package ITCrowd.Basics.Reporistroy.Student_From;

import ITCrowd.Basics.Model.Student_From.Student_Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student_Detail,Long> {
}

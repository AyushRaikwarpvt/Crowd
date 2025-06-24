package ITCrowd.Basics.Service.Student_From;

import ITCrowd.Basics.Model.Student_From.Student_Detail;
import ITCrowd.Basics.Reporistroy.Student_From.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_Service {

    @Autowired
    private StudentRepo studentDtlRepo;

    // ✅ GET all students
    public List<Student_Detail> Getall(){
        return studentDtlRepo.findAll();
    }

    // ✅ POST student
    public Student_Detail PostStd(Student_Detail student){
        return studentDtlRepo.save(student);
    }

    // ✅ PUT (update student)
    public Student_Detail updateStudent(Student_Detail student){
        return studentDtlRepo.save(student);
    }

    // ✅ DELETE student by ID
    public void deleteStudent(Long id){
        studentDtlRepo.deleteById(id);
    }

    public List<Student_Detail> saveAll(List<Student_Detail> students){
        return studentDtlRepo.saveAll(students);
    }



}

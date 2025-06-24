package ITCrowd.Basics.Controller.Student_From;

import ITCrowd.Basics.Model.Student_From.Student_Detail;
import ITCrowd.Basics.Service.Student_From.Student_Service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/Student")
public class
StudentController {

    @Autowired
    private Student_Service studentService;

    @Autowired
    private Validator validator; // ✅ Built-in validator for manual validation

    @GetMapping("/Get")
    public List<Student_Detail> getAll() {
        return studentService.Getall();
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student with ID " + id + " deleted successfully.";
    }

    @PutMapping("/Update")
    public Student_Detail updateStudent(@RequestBody Student_Detail student) {
        return studentService.updateStudent(student);
    }

    // ✅ One method for both single and multiple insert, with validation
    @PostMapping("/Post")
    public ResponseEntity<?> postFlexible(@RequestBody Object inputJson) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            if (inputJson instanceof List<?>) {
                // Multiple students
                List<Student_Detail> list = mapper.convertValue(
                        inputJson, new TypeReference<List<Student_Detail>>() {});
                List<String> errors = new ArrayList<>();

                for (int i = 0; i < list.size(); i++) {
                    Set<ConstraintViolation<Student_Detail>> violations = validator.validate(list.get(i));
                    for (ConstraintViolation<Student_Detail> v : violations) {
                        errors.add("Item " + i + ": " + v.getPropertyPath() + " " + v.getMessage());
                    }
                }

                if (!errors.isEmpty()) {
                    return ResponseEntity.badRequest().body(errors);
                }

                return ResponseEntity.ok(studentService.saveAll(list));

            } else {
                // Single student
                Student_Detail student = mapper.convertValue(inputJson, Student_Detail.class);
                Set<ConstraintViolation<Student_Detail>> violations = validator.validate(student);

                if (!violations.isEmpty()) {
                    List<String> errorList = violations.stream()
                            .map(v -> v.getPropertyPath() + " " + v.getMessage())
                            .toList();
                    return ResponseEntity.badRequest().body(errorList);
                }

                return ResponseEntity.ok(studentService.PostStd(student));
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid JSON format");
        }
    }
}

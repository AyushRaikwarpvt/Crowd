//package ITCrowd.Basics.Controler;
//
//import ITCrowd.Basics.Model.Employe;
//import ITCrowd.Basics.Reporistroy.Empolye_Repository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/emp")
//public class Employes_Controller {
//
//    @Autowired
//    private Empolye_Repository empolyeRepository;
//
//    // 🔹 Create new employee
//    @PostMapping("/save")
//    public ResponseEntity<String> createEmployee(@RequestBody Employe employe) {
//        empolyeRepository.save(employe);
//        return ResponseEntity.status(201).body("✅ Employee created successfully");
//    }
//
//    // 🔹 Get all employees
//    @GetMapping("/get")
//    public ResponseEntity<List<Employe>> getAllEmployees() {
//        List<Employe> employees = (List<Employe>) empolyeRepository.findAll();
//        return ResponseEntity.ok(employees); // 200 OK
//    }
//
//    // 🔹 Update employee by ID
//    @PutMapping("/update/{id}")
//    public ResponseEntity<String> updateEmployee(@PathVariable Integer id, @RequestBody Employe updatedData) {
//        Optional<Employe> optionalEmp = empolyeRepository.findById(id);
//        if (optionalEmp.isPresent()) {
//            Employe existingEmp = optionalEmp.get();
//            existingEmp.setName(updatedData.getName());
//            existingEmp.setCity(updatedData.getCity());
//            existingEmp.setAge(updatedData.getAge());
//            empolyeRepository.save(existingEmp);
//            return ResponseEntity.ok("🛠️ Employee updated successfully (ID: " + id + ")");
//        } else {
//            return ResponseEntity.status(404).body("❌ Employee not found (ID: " + id + ")");
//        }
//    }
//
//    // 🔹 Delete employee by ID
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
//        if (empolyeRepository.existsById(id)) {
//            empolyeRepository.deleteById(id);
//            return ResponseEntity.ok("🗑️ Employee deleted successfully (ID: " + id + ")");
//        } else {
//            return ResponseEntity.status(404).body("❌ Employee not found (ID: " + id + ")");
//        }
//    }
//}

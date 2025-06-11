package ITCrowd.Basics.Controler;

import ITCrowd.Basics.Model.Employe;
import ITCrowd.Basics.Reporistroy.Empolye_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/emp")

public class Employes_Controller {
    @Autowired
    private Empolye_Repository empolye_repository;

    @PostMapping("/save")
    public ResponseEntity<Object> create(@RequestBody Employe employes){
    empolye_repository.save(employes);
    return ResponseEntity.status(HttpStatus.CREATED).body("Emp ka data Aagya guru");
    }
    @GetMapping("/get")
    public ResponseEntity<Object> getAllEmployee(){
        return ResponseEntity.status(HttpStatus.FOUND).body(empolye_repository.findAll());
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Object> update(@PathVariable Integer id,@RequestBody Employe employe){
        Optional<Employe> emp = empolye_repository.findById(id);
        if (emp.isPresent()) {
            Employe existingEmploy = emp.get();
            existingEmploy.setName(employe.getName());
            existingEmploy.setCity(employe.getCity());
            existingEmploy.setAge(employe.getAge());
            empolye_repository.save(existingEmploy);
            return ResponseEntity.status(HttpStatus.OK).body("employes Updated Sucessfully " + id);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("employes Are Not Found " + id);
        }
    }
}
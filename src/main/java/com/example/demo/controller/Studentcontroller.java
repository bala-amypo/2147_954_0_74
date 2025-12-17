package.com.example.demo.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Studentcontroller {
    @Autowired
    Studentservice service

    @PostMapping("/add")
    public Studententity post(@RequestBody Studententity st){
        return service.savedata(st);
    }

    @GetMapping("/getAll")
    public List<Studententity>getAll(){
        return service.getAllStudents();
    }
    @GetMapping("/get/{id}")
    public Optional<Studententity> get(@PathVariable int id){
        return service.getOneStudent();
    }
    @PutMapping("/update/{id}")
    public String update (@PathVariable int id , @RequestBody Studententity newStudent){
        Optional<
    }
}
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
import org.springframework.demo.entity.Student;
import org.springframework.
@RestController
public class Studentcontroller {
    @Autowired
    Studentservice service

    @PostMapping("/add")
    public Student post(@RequestBody Student st){
        return service.savedata(st);
    }

    @GetMapping("/getAll")
    public List<Student>getAll(){
        return service.getAllStudents();
    }
    @GetMapping("/get/{id}")
    public Optional<Student> get(@PathVariable int id){
        return service.getOneStudent();
    }
    @PutMapping("/update/{id}")
    public String update (@PathVariable int id , @RequestBody Student newStudent){
        Optional<Student> student = service.getOneStudent(id);
        if(student.isPresent()){
          service.insertStudent(newStudent);
          return "Updated successfully";
        }
        return "Id not found"';
    }
    @DeleteMapping("/del/{id}")
    public String deleteStudent(@PathVariable int id){
        Optional <Student> student = service.deleteStudent(id);
        if (student.isPresent()){
          service.deleteStudent(id);
          return "Deleted successfully";
        }
        return "id not found";
    }
}
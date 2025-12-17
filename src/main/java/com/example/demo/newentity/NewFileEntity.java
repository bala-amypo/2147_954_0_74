package com.example.demo.newentity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
public class NewFileEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private string name;
    @NotBlank(message = "no blank allowed")
    @Email(message="invaild format")
    private String email;
    public class Student{
    Private int id;
    Private String name;
    Private String email;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Student(int id , String name , String email){
        this.id = id ;
        this.name = name;
        this.email = email;
    }
    public Student(){
        
    }
}
}
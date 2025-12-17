package com.example.demo.newentity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
public class NewFileEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
}
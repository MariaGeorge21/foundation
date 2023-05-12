package com.example.test.controller;

import com.example.test.model.Student;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping
public class Studentcontroller {
   
    @PostMapping("/addstudent")
    public ResponseEntity<Student> create(@RequestBody Student student){
        return ResponseEntity.ok().body(null);
    }
    
    @GetMapping("/allstudents")
    public ResponseEntity<Student> getBook(){
        
            return ResponseEntity.ok().body(null);
        
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getUser(@PathVariable Long id){

        return ResponseEntity.ok().body(null);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateDetails(@RequestBody Student student){
        
            return ResponseEntity.ok().build();
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Void> deleteBook(@PathVariable long id){
            
                return ResponseEntity.ok().build();
            
        }
    }


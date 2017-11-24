package com.codeup.kidsync.services;


import com.codeup.kidsync.models.Student;
import com.codeup.kidsync.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service //Step 1 Annotate class- Spring Boot can't create object
    public class StudentsSvc {

        private final StudentsRepository studentsDoa;

        @Autowired
        public StudentsSvc(StudentsRepository studentsDoa) {
            this.studentsDoa = studentsDoa;
        }

        public Iterable<Student> findAll() {  //returns ALL students and takes place of SHOWALL in students controller
            return studentsDoa.findAll();
        }

        public Student save(Student student) {
            studentsDoa.save(student);
            return student;
        }

        public Student findOne(long id) {
            return studentsDoa.findOne(id);
        }

//        public void deletePost(long id) {
//            studentsDoa.delete(id);
//        }


    }

package com.codeup.kidsync.services;


import com.codeup.kidsync.models.Class;
import com.codeup.kidsync.repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassSvc {

    private ClassRepository classDoa;

    @Autowired
    public ClassSvc(ClassRepository classDoa) {
        this.classDoa = classDoa;
    }

    public Class save(Class classroom) {
        classDoa.save(classroom);
        return classroom;
    }

    public List<Class> findClassByTeacher(Long userId){
        return classDoa.findAllByUserId(userId);
    }

}

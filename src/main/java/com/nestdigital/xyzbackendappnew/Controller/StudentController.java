package com.nestdigital.xyzbackendappnew.Controller;

import com.nestdigital.xyzbackendappnew.Model.StudentModel;
import com.nestdigital.xyzbackendappnew.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/studentEntry",consumes = "application/json",produces = "application/json")
    public String studentEntry(@RequestBody StudentModel student) {
        System.out.println(student.toString());
        dao.save(student);
        return "{status:'Success'}";
    }
}

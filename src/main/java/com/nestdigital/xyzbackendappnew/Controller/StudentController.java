package com.nestdigital.xyzbackendappnew.Controller;

import com.nestdigital.xyzbackendappnew.Model.StudentModel;
import com.nestdigital.xyzbackendappnew.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/studentEntry", consumes = "application/json", produces = "application/json")
    public String studentEntry(@RequestBody StudentModel student) {
        System.out.println(student.toString());
        dao.save(student);
        return "{status:'Success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewAll")
    public List<StudentModel> ViewAll(){
        return (List<StudentModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/delete",consumes = "application/json" ,produces = "application/json")
    public String Deletestudent(@RequestBody StudentModel student)
    {
        dao.deleteStudentById(student.getId());
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchStudent",consumes = "application/json" ,produces = "application/json")
    public  List<StudentModel> SearchStudent(@RequestBody StudentModel student)
    {
        return (List<StudentModel>) dao.searchStudent(student.getName(),student.getAdmno());
    }
}


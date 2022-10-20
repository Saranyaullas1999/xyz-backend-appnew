package com.nestdigital.xyzbackendappnew.Controller;


import com.nestdigital.xyzbackendappnew.Model.FacultyModel;
import com.nestdigital.xyzbackendappnew.dao.FacultyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class FacultyController {

    @Autowired
    private FacultyDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addFaculty",consumes = "application/json",produces = "application/json")
    public String AddFaculty(@RequestBody FacultyModel faculty){
        System.out.println(faculty.toString());
       dao.save(faculty);
        return "{status:'success'}";
    }

   @CrossOrigin(origins = "*")
   @GetMapping("/viewFaculty")
   public List<FacultyModel> ViewFaculty(){
        return (List<FacultyModel>) dao.findAll();
   }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteFaculty",consumes = "application/json",produces = "application/json")
    public String DeleteFaculty(@RequestBody FacultyModel faculty){
        dao.deleteFaculty(faculty.getId());
        return "{Status:'Success}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchFaculty",consumes = "application/json",produces = "application/json")
    public List<FacultyModel> Searchfaculty(@RequestBody FacultyModel faculty)
    {
        return (List<FacultyModel>) dao.SearchFaculty(faculty.getName());
    }


  }

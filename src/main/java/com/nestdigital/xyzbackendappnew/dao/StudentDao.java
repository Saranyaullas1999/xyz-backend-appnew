package com.nestdigital.xyzbackendappnew.dao;

import com.nestdigital.xyzbackendappnew.Model.StudentModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `students` WHERE `id`=:id",nativeQuery = true)
    void deleteStudentById(Integer id);


    @Query(value = "SELECT `id`, `address`, `admno`, `bloodgroup`, `college`, `department`, `dob`, `email`, `guardianname`, `name`, `parentname`, `rollno` FROM `students` WHERE `name`=:name OR`admno`=:admno",nativeQuery = true)
    List<StudentModel> searchStudent(String name,String admno);

}

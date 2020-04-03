package com.mikovic.dao;

import com.mikovic.model.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> findAll();
    public Student findById(int id);
    public void save(Student student);
    public void delete(Student student);

}

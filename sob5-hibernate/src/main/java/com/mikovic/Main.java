package com.mikovic;

import com.mikovic.model.Student;
import com.mikovic.service.StudentImpl;

public class Main {
    public static void main(String[] args){
        StudentImpl studentImpl = new StudentImpl();
        for (int i=1;  i<11; i++) {
            Student student = new Student();
            student.setMark(17 + i);
            student.setName("Masha № " + i);
            studentImpl.save(student);
        }
        for (Student student: studentImpl.findAll()){
            System.out.println(student);
        }
        System.out.println("-----------------------------");
        System.out.println(studentImpl.findById(4));
        System.out.println("-----------------------------");
        studentImpl.delete(studentImpl.findById(5));
        studentImpl.delete(studentImpl.findById(7));
        studentImpl.delete(studentImpl.findById(9));
        for (Student student: studentImpl.findAll()){
            System.out.println(student);
        }
    }

}

package com.mikovic;

import com.mikovic.model.Mark;
import com.mikovic.model.Student;
import com.mikovic.service.MarkImpl;
import com.mikovic.service.StudentImpl;

public class Main {
    public static void main(String[] args){
        StudentImpl studentImpl = new StudentImpl();
        MarkImpl markImpl = new MarkImpl();
        for (int i=1;  i<11; i++) {
            Student student = new Student();
            if(i<4 || i>8) {
                student.addMark(markImpl.findById(1));
                student.addMark(markImpl.findById(2));
            }else {
                student.addMark(markImpl.findById(2));
                student.addMark(markImpl.findById(3));
            }
            student.setName("Masha № " + i);
            studentImpl.save(student);
        }
        for (Student student: studentImpl.findAll()){
            System.out.println(student);
        }
        System.out.println("-----------------------------");
        System.out.println(studentImpl.findById(4));
        System.out.println("----------ОЦЕНКИ--------------");
        for (Mark mark: studentImpl.findById(6).getMarks()){
            System.out.println(mark.getValue());
        }
        System.out.println("-----------------------------");
        Student student = studentImpl.findById(5);
        studentImpl.delete(student);
        student = studentImpl.findById(7);
        studentImpl.delete(student);
        student = studentImpl.findById(9);
        studentImpl.delete(student);
        for (Student st: studentImpl.findAll()){
            System.out.println(st);
        }
    }

}

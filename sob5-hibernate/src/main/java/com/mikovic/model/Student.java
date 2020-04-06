package com.mikovic.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;



    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "students_marks",
            joinColumns = @JoinColumn(name = "student_id" ),
            inverseJoinColumns = @JoinColumn(name =  "mark_id" )
    )
    private List<Mark> marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mark> getMarks() {
        if(marks==null){
            this.marks =new ArrayList<>();
        }
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
    public void addMark(Mark mark)
    {
        getMarks().add(mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

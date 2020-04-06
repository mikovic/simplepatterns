package com.mikovic.service;

import com.mikovic.HibernateSessionFactory;
import com.mikovic.dao.StudentDao;
import com.mikovic.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import static com.mikovic.HibernateSessionFactory.getSessionFactory;

public class StudentImpl implements StudentDao {


    @Override
    public List<Student> findAll() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        List<Student>students = (List<Student>)  session.createQuery("from Student").list();
        session.close();
        return students;

    }

    @Override
    public Student findById(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }

    @Override
    public void save(Student student) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(student);
        tx1.commit();
        session.close();

    }

    @Override
    public void delete(Student student) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(student);
        tx1.commit();
        session.close();
    }
}


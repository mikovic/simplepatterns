package com.mikovic.service;

import com.mikovic.HibernateSessionFactory;
import com.mikovic.dao.MarkDao;
import com.mikovic.model.Mark;
import com.mikovic.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MarkImpl implements MarkDao {
    @Override
    public void save(Mark mark) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(mark);
        tx1.commit();
        session.close();

    }

    @Override
    public void delete(Mark mark) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(mark);
        tx1.commit();
        session.close();

    }

    @Override
    public Mark findById(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Mark mark = session.get(Mark.class, id);
        session.close();
        return mark;
    }
}

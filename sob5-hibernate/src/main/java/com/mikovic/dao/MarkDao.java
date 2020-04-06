package com.mikovic.dao;

import com.mikovic.model.Mark;

public interface MarkDao {
    public void save(Mark mark);
    public void delete(Mark mark);
    public Mark findById(int id);
}

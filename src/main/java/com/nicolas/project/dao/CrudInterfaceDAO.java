package com.nicolas.project.dao;

import java.util.List;

public interface CrudInterfaceDAO<T> {
    public void create(T obj);

    public List<T> read();

    public void update(T obj);

    public void delete(int id);
}

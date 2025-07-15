package com.nicolas.project.app;

import java.sql.Connection;

import com.nicolas.project.config.MySQLConnection;
import com.nicolas.project.dao.CrudCategory;
import com.nicolas.project.models.Category;

public class Main {
    public static void main(String[] args) {
        CrudCategory crudCat = new CrudCategory();
        Category category = new Category("Food");

        crudCat.create(category);

        System.out.println(category);
        System.out.println(category.getId());
    }
}
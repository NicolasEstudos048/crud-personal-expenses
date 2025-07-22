package com.nicolas.project.app;

import com.nicolas.project.dao.CrudCategory;
import com.nicolas.project.models.Category;

public class Main {
    public static void main(String[] args) {
        CrudCategory crudCat = new CrudCategory();
        Category category = new Category(1, "Phone");

        crudCat.update(category);

        System.out.println(crudCat.read());
    }
}
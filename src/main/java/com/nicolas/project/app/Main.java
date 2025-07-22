package com.nicolas.project.app;

import com.nicolas.project.dao.CrudCategory;

public class Main {
    public static void main(String[] args) {
        CrudCategory crudCat = new CrudCategory();

        System.out.println(crudCat.read());
        crudCat.delete(1);
        System.out.println(crudCat.read());
    }
}
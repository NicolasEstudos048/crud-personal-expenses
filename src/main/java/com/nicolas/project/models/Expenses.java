package com.nicolas.project.models;

import java.math.BigDecimal;
import java.sql.Date;

public class Expenses {
    private int id;
    private int idCategory;
    private int idUser;

    private String describe;
    private BigDecimal value;
    private Date data_expenses;

    private Category category;
    private User user;

    public Expenses(int id, int idCategory, int idUser, String describe, BigDecimal value, Date data_expenses) {
        this.id = id;
        this.idCategory = category.getId();
        this.idUser = user.getId();
        this.describe = describe;
        this.value = value;
        this.data_expenses = data_expenses;
    }

    public Expenses(int idCategory, int idUser, String describe, BigDecimal value, Date data_expenses,
            Category category, User user) {
        this.idCategory = idCategory;
        this.idUser = idUser;
        this.describe = describe;
        this.value = value;
        this.data_expenses = data_expenses;
        this.category = category;
        this.user = user;
    }

    public Expenses(int id, int idCategory, int idUser, String describe, BigDecimal value, Date data_expenses,
            Category category, User user) {
        this.id = id;
        this.idCategory = idCategory;
        this.idUser = idUser;
        this.describe = describe;
        this.value = value;
        this.data_expenses = data_expenses;
        this.category = category;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Date getData_expenses() {
        return data_expenses;
    }

    public void setData_expenses(Date data_expenses) {
        this.data_expenses = data_expenses;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Expenses [id=" + id + ", idCategory=" + idCategory + ", idUser=" + idUser + ", describe=" + describe
                + ", value=" + value + ", data_expenses=" + data_expenses + "]";
    }
}

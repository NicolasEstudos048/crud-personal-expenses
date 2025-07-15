package com.nicolas.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.nicolas.project.config.MySQLConnection;
import com.nicolas.project.models.Category;

public class CrudCategory implements CrudInterfaceDAO<Category> {

    @Override
    public void create(Category category) {
        String sql = "INSERT INTO category (name) VALUES (?)";

        try (Connection conn = MySQLConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            stmt.setString(1, category.getName());
            int rows = stmt.executeUpdate();
            System.out.printf("%d rows affected %n", rows);

            ResultSet keys = stmt.getGeneratedKeys();

            if (keys.next()) {
                category.setId(keys.getInt(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Category> read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public void update(Category obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}

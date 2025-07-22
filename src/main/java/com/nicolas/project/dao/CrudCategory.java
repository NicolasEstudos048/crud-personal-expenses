package com.nicolas.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
        List<Category> categories = new ArrayList<>();
        String sql = "SELECT * FROM category";

        try (Connection conn = MySQLConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                categories.add(new Category(
                        rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return categories;
    }

    @Override
    public void update(Category category) {
        String sql = "UPDATE category SET name=? WHERE id=?";

        try (Connection conn = MySQLConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setString(1, category.getName());
            stmt.setInt(2, category.getId());

            int rows = stmt.executeUpdate();
            System.out.printf("%d rows affected %n", rows);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM category WHERE id=?";

        try (Connection conn = MySQLConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();

            System.out.printf("%d rows affected %n", rows);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

package ru.rewrite.sprig_jdbc.util;

import org.springframework.jdbc.core.RowMapper;
import ru.rewrite.sprig_jdbc.model.Book;

import java.sql.ResultSet;
import java.sql.SQLException;


public class BookMapper implements RowMapper {
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
        Book book = new Book();
        book.setName(resultSet.getString("name"));
        book.setAuthor(resultSet.getString("author"));
        book.setCost(resultSet.getDouble("cost"));
        book.setId(resultSet.getInt("id"));
        return book;
    }
}

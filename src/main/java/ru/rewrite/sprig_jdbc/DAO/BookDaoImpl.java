package ru.rewrite.sprig_jdbc.DAO;

import org.springframework.jdbc.core.JdbcTemplate;
import ru.rewrite.sprig_jdbc.model.Book;
import ru.rewrite.sprig_jdbc.util.BookMapper;

import javax.sql.DataSource;
import java.util.List;

public class BookDaoImpl implements BookDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource ds) {
        dataSource = ds;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createBook(String name, double cost, String author, int id) {
        String SQL = "INSERT INTO Books (name, cost, author, id) VALUES (?,?,?,?)";

        jdbcTemplate.update(SQL, name, cost, author, id);
        System.out.println("Book successfully created.\n" +
                "Name: " + name + ";\n" +
                "Cost: " + cost + ";\n" +
                "Author: " + author + ";\n" +
                "Id:" + id + ".");
    }

    public Book getBookById(int id) {
        String SQL = "SELECT * FROM Books WHERE id=?";
        Book book = (Book) jdbcTemplate.queryForObject(SQL, new Object[]{id}, new BookMapper());
        return book;
    }

    public List<Book> listBooks() {
        String SQL = "SELECT * FROM Books";
        List<Book> books = jdbcTemplate.query(SQL, new BookMapper());
        return  books;
    }

    public void removeBookById(Integer id) {

    }

    public void updateBook(String name, double cost, String author, int id) {

    }
}

package ru.rewrite.sprig_jdbc.DAO;

import ru.rewrite.sprig_jdbc.model.Book;

import javax.sql.DataSource;
import java.util.List;

public interface BookDao {
    public void setDataSource(DataSource ds);

    public void createBook(String name, double cost, String author, int id);

    public Book getBookById(int id);

    public List<Book> listBooks();

    public void removeBookById(Integer id);

    public void updateBook(String name, double cost, String author, int id);
}

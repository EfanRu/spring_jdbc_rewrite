package ru.rewrite.sprig_jdbc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.rewrite.sprig_jdbc.DAO.BookDaoImpl;
import ru.rewrite.sprig_jdbc.model.Book;

public class JdbcRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        BookDaoImpl bookDao = (BookDaoImpl) context.getBean("BookDao");

        bookDao.createBook("Clean code", 12.33, "Robert Martin", 22);
        bookDao.createBook("SQL", 13.88, "Kris Fraily", 17);
        bookDao.createBook("Patterns", 2.33, null, 2);

        for (Book b : bookDao.listBooks()) {
            System.out.println(b.toString());
        }
    }
}

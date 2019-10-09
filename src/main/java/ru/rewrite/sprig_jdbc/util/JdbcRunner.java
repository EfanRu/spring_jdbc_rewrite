package ru.rewrite.sprig_jdbc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.rewrite.sprig_jdbc.DAO.BookDaoImpl;

public class JdbcRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("");
        //!!!need add xml config
        BookDaoImpl bookDao = context.getBean("BookDao");
    }

    /*
            ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbctemplate-developer-config.xml");

        JdbcTemplateDeveloperDaoImpl jdbcTemplateDeveloperDao =
                (JdbcTemplateDeveloperDaoImpl) context.getBean("jdbcTemplateDeveloperDao");

    */
}

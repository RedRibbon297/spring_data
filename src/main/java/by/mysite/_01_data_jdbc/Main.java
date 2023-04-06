package by.mysite._01_data_jdbc;

import by.mysite._01_data_jdbc.entities.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);//для подключения к БД
        dataSource.setUrl("jdbc:mysql://localhost:3306/itclass_po60");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        JdbcTemplate template = new JdbcTemplate(dataSource);

        List<User> users = template.query("SELECT * FROM user", new UserRowMapping());
        users.forEach(System.out::println);

        System.out.println("-----------");
        //users = template.query("SELECT * FROM user WHERE id > ?", new UserRowMapping(), 0);

        template.update("UPDATE user SET name = ? WHERE id = ?", "Sergey", 2);
        users = template.query("SELECT * FROM user", new UserRowMapping());

        users.forEach(System.out::println);
    }
}

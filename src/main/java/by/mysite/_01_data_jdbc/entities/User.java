package by.mysite._01_data_jdbc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data //гетеры и сетеры
@ToString

public class User {
    private int id;
    private String name;
    private int age;
}

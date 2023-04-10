package by.mysite._02_data_jpa.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "passengers")

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

@Data
@ToString
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull // к @RequiredArgsConstructor для конструктора только с аргументом "name"
    private String name;



}

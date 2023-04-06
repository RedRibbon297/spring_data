package by.mysite._02_data_jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "airplanes")

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@Column - здесь не обязательно
    private String model;
    private int seats;

    public Airplane(String model, int seats) {
        this.model = model;
        this.seats = seats;
    }
}

package by.mysite._02_data_jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany
    @JoinColumn(name = "airplane_id")
    //если не делать эту аннотацию то в БД создастся доп. связующая таблица "airplane_passenger"
    //с айдишниками "airplane_id" и "passengers_id"
    private List<Passenger> passengers;

    public Airplane(String model, int seats) {
        this.model = model;
        this.seats = seats;
    }
}

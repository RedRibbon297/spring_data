package by.mysite._02_data_jpa.repositories;

import by.mysite._02_data_jpa.entities.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

}

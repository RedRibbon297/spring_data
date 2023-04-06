package by.mysite._02_data_jpa.repositories;

import by.mysite._02_data_jpa.entities.Airplane;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {
    Airplane findAirplanesByModel(String model);
    Airplane findAirplanesByModelAndSeats(String model, int seats);

    @Query(value = "SELECT * FROM airplanes WHERE model =?1 AND seats > ?2", nativeQuery = true)
    List<Airplane> findBoeing (String model, int seats);
}

package by.mysite._02_data_jpa;

import by.mysite._02_data_jpa.config.AppConfig;
import by.mysite._02_data_jpa.entities.Airplane;
import by.mysite._02_data_jpa.entities.Passenger;
import by.mysite._02_data_jpa.repositories.AirplaneRepository;
import by.mysite._02_data_jpa.repositories.PassengerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AirplaneRepository airplaneRepository = ctx.getBean(AirplaneRepository.class);
        PassengerRepository passengerRepository = ctx.getBean(PassengerRepository.class);

        List<Passenger> passengerList = Arrays.asList(
                new Passenger("Vania"),
                new Passenger("Kolia")
        );
        passengerRepository.saveAll(passengerList);

        Airplane airplane = new Airplane("Sukhoy SuperJet",2);
        airplane.setPassengers(passengerList);
        airplaneRepository.save(airplane);
    }
}

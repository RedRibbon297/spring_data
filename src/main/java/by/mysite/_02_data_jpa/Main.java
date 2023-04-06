package by.mysite._02_data_jpa;

import by.mysite._02_data_jpa.config.AppConfig;
import by.mysite._02_data_jpa.entities.Airplane;
import by.mysite._02_data_jpa.repositories.AirplaneRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.SignatureSpi;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AirplaneRepository repository = ctx.getBean(AirplaneRepository.class);

//        Airplane airplane = new Airplane("Boeing 737", 656);
//        System.out.println(airplane);
//        airplane = repository.save(airplane);
//        System.out.println(airplane);
//        airplane.setSeats(100500);
//        airplane = repository.save(airplane);
//        System.out.println(airplane);

        Airplane boeing747 = repository.findAirplanesByModel("Boeing 747");
        System.out.println(boeing747);

        Airplane boeing737 = repository.findAirplanesByModelAndSeats("Boeing 737", 656);
        System.out.println(boeing737);

        List<Airplane> planes = repository.findBoeing("Boeing 737", 500);
        planes.forEach(System.out::println);
    }
}

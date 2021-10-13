package web.DAO;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CarDaoImpl implements CarDAO {
    @Override
    public  List<Car> getCars (int number) {
        List <Car> carlist  = new ArrayList<>();
        carlist.add(new Car("Ford", 120, "1998"));
        carlist.add(new Car("Ferrari", 001, "2012"));
        carlist.add(new Car("Aston Martin", 999, "2013"));
        carlist.add(new Car("FIAT", 120, "2014"));
        carlist.add(new Car("BMW", 320, "2015"));

        if (number < 1 || number > 5) return carlist;

        return carlist.subList(0, number);

    }


}

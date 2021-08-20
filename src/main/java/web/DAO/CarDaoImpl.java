package web.DAO;

import web.model.Car;

import java.util.List;

public class CarDaoImpl implements CarDAO {
    @Override
    public  List<Car> carsCount(List<Car> carliest, int number) {
        if (number < 1 || number > 5) return carliest;
        return carliest.subList(0, number);

    }
}

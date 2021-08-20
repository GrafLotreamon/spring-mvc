package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    public  List<Car> carsCount(List<Car> carliest, int number);
}
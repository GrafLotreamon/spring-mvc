package web.Service;

import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

public interface CarServiceInterface {
    public List<Car> carsCount(List<Car> carliest, int number);
}

package web.Service;

import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

public class CarService implements CarServiceInterface {

    CarDAO cardao;

    public List<Car> carsCount(List<Car> carliest, int number) {
        return cardao.carsCount(carliest,number);
    }
}

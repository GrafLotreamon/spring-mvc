package web.Service;

import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCars (int number);
}

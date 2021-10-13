package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDAO cardao;

    public List<Car> getCars (int number) {
        return cardao.getCars(number);
    }
}

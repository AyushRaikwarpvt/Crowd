package ITCrowd.Basics.Service;

import ITCrowd.Basics.Model.Car;
import ITCrowd.Basics.Reporistroy.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> GetAllCars(){
        return  carRepository.findAll();
    }
    public Car  addCar(Car car){
        return carRepository.save(car);
    }

}

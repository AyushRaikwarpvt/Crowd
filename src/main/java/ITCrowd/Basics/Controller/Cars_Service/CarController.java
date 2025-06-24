//package ITCrowd.Basics.Controler;
//
//
//import ITCrowd.Basics.Model.Car;
//import ITCrowd.Basics.Service.Cars_Service.CarService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/Cars")
//public class CarController {
//    @Autowired
//    private CarService carService;
//    @GetMapping("/Get")
//    public List<Car> GetAll(){
//        return carService.GetAllCars();
//    }
//    @PostMapping("/Add")
//    public Car addcar(@RequestBody Car car){
//        return carService.addCar(car);
//    }
//}

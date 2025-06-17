//package ITCrowd.Basics.Mapping.OneToMany;
//import jakarta.persistence.*;
//import java.util.List;
//
//@Entity
//public class Car {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String model;
//
//    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
//    private List<Accessories> accessories;
//
//    // getters and setters
//}

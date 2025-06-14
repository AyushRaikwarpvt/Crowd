package ITCrowd.Basics.Mapping.OneToMany;

import jakarta.persistence.*;

@Entity
public class Accessories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    // getters and setters
}

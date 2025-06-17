package ITCrowd.Basics.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;



@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Brand;
    private String Model;

    @ManyToOne
    @JoinColumn(name = "showroom_id")
    private Showroom showroom;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_details_id")
    private CarDetails carDetails;

    @ManyToMany
    @JoinTable(
            name = "car_accessory",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "accessory_id")
    )
    private List<Accessories> accessories;
}

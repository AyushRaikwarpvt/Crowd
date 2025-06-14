//package ITCrowd.Basics.Model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType; // Import added
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Table(name = "Employes") // Table name should be in quotes, not ended with semicolon
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class Employe {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO) // Fixed case and syntax
//    private Integer id;
//
//    private String name;  // Follow camelCase convention
//    private String city;
//    private int age;
//
//
//    public static void printMsg(String docker) {
//        System.out.println("Running");
//    }
//}

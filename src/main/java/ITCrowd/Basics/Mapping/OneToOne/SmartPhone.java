//package ITCrowd.Basics.Mapping.OneToOne;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "SmartPhone")
//@Getter
//@Setter
//public class SmartPhone {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int PhoneId;
//    private String SmartPhoneNamr;
//    private String Processer;
//
//    @OneToOne(mappedBy = "smartPhone")
//    private Student student;
//
//    // ✅ Constructor including student
//    public SmartPhone(int phoneId, String smartPhoneNamr, String processer, Student student) {
//        PhoneId = phoneId;
//        SmartPhoneNamr = smartPhoneNamr;
//        Processer = processer;
//        this.student = student;
//    }
//
//
//}

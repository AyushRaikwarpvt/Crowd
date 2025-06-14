//package ITCrowd.Basics.Mapping.OneToOne;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "Student")
//@Getter
//@Setter
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int StudentID;
//    private String StudentName;
//    private String StudenttAge;
//
//    @OneToOne(cascade = CascadeType.ALL) // ✅ Cascade added
//    @JoinColumn(name = "Std_Phone_Id")
//    private SmartPhone smartPhone;
//
//    // ✅ Constructor including SmartPhone
//    public Student(int studentID, String studentName, String studenttAge, SmartPhone smartPhone) {
//        StudentID = studentID;
//        StudentName = studentName;
//        StudenttAge = studenttAge;
//        this.smartPhone = smartPhone;
//    }
//}

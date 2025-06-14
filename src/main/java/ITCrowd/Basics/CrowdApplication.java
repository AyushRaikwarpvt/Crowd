package ITCrowd.Basics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrowdApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrowdApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Employe.printMsg("Docker");  // ✅ Static method call, no @Autowired needed
    }
}
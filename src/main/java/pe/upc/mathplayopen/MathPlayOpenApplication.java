package pe.upc.mathplayopen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MathPlayOpenApplication {
    public static void main(String[] args) {
        SpringApplication.run(MathPlayOpenApplication.class, args);
    }
}





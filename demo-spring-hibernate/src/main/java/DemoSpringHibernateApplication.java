import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ajeetkg")
public class DemoSpringHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringHibernateApplication.class, args);
    }
}
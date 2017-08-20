package mongodb.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by juliochrisostomo on 20/08/17.
 */
@SpringBootApplication
@ComponentScan("mongodb.*")
@EnableMongoRepositories("mongodb/repositories")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

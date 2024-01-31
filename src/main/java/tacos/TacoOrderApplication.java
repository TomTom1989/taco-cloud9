package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoOrderApplication.class, args);
    }
}

// curl command
// curl -X POST http://localhost:8080/api/tacos -H "Content-Type: application/json" -d "{\"name\": \"Veggie Taco\", \"ingredients\": [{\"id\": \"1\", \"name\": \"Lettuce\"}, {\"id\": \"2\", \"name\": \"Tomato\"}, {\"id\": \"3\", \"name\": \"Cheese\"}]}"

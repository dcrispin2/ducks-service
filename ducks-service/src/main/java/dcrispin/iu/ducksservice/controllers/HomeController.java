package dcrispin.iu.ducksservice.controllers;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// ./mvnw spring-boot:run

@RestController
public class HomeController {
    @GetMapping("/")
    public String greetings()
    {
        return "Welcome to the ducks service!";
    }

}

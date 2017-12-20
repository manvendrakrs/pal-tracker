package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

<<<<<<< HEAD

    private String welcomeMessage;

    public WelcomeController(
            @Value("${welcome_message}") String welcomeMessage
=======
    private String welcomeMessage;

    public WelcomeController(
        @Value("${welcome_message}") String welcomeMessage
>>>>>>> e9e280b752a7d6eee0eecf11b1f824f188904ef5
    ) {
        this.welcomeMessage = welcomeMessage;
    }

    @GetMapping("/")
    public String sayHello() {
        return welcomeMessage;
    }
}

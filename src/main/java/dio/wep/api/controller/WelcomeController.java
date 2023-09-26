package dio.wep.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    private String welcome() {
        return "Welcome to My Sprong Boot Web API";
    }
}

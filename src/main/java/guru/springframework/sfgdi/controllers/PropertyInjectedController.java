package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingService service;

    public String getGreeting() {
        return service.sayGreeting();
    }

}

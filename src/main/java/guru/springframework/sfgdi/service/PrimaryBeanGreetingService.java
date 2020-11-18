package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello ---- from the primary bean";
    }
}

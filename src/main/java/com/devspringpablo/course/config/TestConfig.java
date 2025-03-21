package com.devspringpablo.course.config;

import com.devspringpablo.course.entities.User;
import com.devspringpablo.course.repositories.UserRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired // chamando o spring para resolver a dependencia e associar uma instancia
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Pablo Rodrigues", "pablo@gmail.com", "19994932321", "123456");
        User u2 = new User(null, "Weslei Batista", "weslei@gmail.com", "19994234232", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
    
    
    
}

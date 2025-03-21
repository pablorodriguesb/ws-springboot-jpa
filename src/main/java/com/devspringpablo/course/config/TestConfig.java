package com.devspringpablo.course.config;

import com.devspringpablo.course.entities.Order;
import com.devspringpablo.course.entities.User;
import com.devspringpablo.course.entities.enums.OrderStatus;
import com.devspringpablo.course.repositories.OrderRepository;
import com.devspringpablo.course.repositories.UserRepository;
import java.time.Instant;
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

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Pablo Rodrigues", "pablo@gmail.com", "19994932321", "123456");
        User u2 = new User(null, "Weslei Batista", "weslei@gmail.com", "19994234232", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }

}

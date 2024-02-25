package com.cozzo.ecommerce.backend.infrastructure.config;

import com.cozzo.ecommerce.backend.application.UserService;
import com.cozzo.ecommerce.backend.domain.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository){
        return new UserService(iUserRepository);                            //lo vamos a usar para utilizar los endppoint
    }
}

package com.cozzo.ecommerce.backend.infrastructure.config;

import com.cozzo.ecommerce.backend.application.CategoryService;
import com.cozzo.ecommerce.backend.application.OrderService;
import com.cozzo.ecommerce.backend.application.ProductService;
import com.cozzo.ecommerce.backend.application.UserService;
import com.cozzo.ecommerce.backend.domain.port.ICategoryRepository;
import com.cozzo.ecommerce.backend.domain.port.IOrderRepository;
import com.cozzo.ecommerce.backend.domain.port.IProductRepository;
import com.cozzo.ecommerce.backend.domain.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository){
        return new UserService(iUserRepository);                            //lo vamos a usar para utilizar los endppoint
    }
    @Bean
    public CategoryService categoryService(ICategoryRepository iCategoryRepository){
        return new CategoryService(iCategoryRepository);
    }
    @Bean
    public ProductService productService(IProductRepository iProductRepository){
        return new ProductService(iProductRepository);
    }
    @Bean
    public OrderService orderService(IOrderRepository iOrderRepository){
        return new OrderService(iOrderRepository);
    }
}

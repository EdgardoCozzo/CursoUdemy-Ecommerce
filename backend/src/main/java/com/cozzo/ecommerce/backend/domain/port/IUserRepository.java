package com.cozzo.ecommerce.backend.domain.port;

import com.cozzo.ecommerce.backend.domain.model.User;

public interface IUserRepository {
    User save (User user);
    User findByEmail(String email);
    User findById(Integer id);

}

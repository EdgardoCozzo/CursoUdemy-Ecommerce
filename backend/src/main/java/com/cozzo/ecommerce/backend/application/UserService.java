package com.cozzo.ecommerce.backend.application;

import com.cozzo.ecommerce.backend.domain.model.User;
import com.cozzo.ecommerce.backend.domain.port.IUserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {
private final IUserRepository iUserRepository;

public User save(User user){
    return this.iUserRepository.save(user);
}
public User findById(Integer id){
    return this.iUserRepository.findById(id);}


}

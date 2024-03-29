package com.cozzo.ecommerce.backend.infrastructure.adapter;

import com.cozzo.ecommerce.backend.domain.model.User;
import com.cozzo.ecommerce.backend.domain.port.IUserRepository;
import com.cozzo.ecommerce.backend.infrastructure.entity.UserEntity;
import com.cozzo.ecommerce.backend.infrastructure.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
@AllArgsConstructor
@Repository
public class UserCrudRepositoryImp implements IUserRepository {
    private final IUserCrudRepository iUserCrudRepository;
    private final UserMapper userMapper;

    @Override
    public User save(User user) {
        return userMapper.toUser(iUserCrudRepository.save(userMapper.toUserEntity(user)));
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.toUser(iUserCrudRepository.findById(id).get());
    }
}

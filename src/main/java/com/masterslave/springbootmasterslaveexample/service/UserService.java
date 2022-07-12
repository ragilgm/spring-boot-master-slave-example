package com.masterslave.springbootmasterslaveexample.service;

import com.masterslave.springbootmasterslaveexample.entity.User;
import com.masterslave.springbootmasterslaveexample.repository.UserRepositories;
import com.masterslave.springbootmasterslaveexample.repository.primary.UserRepository;
import com.masterslave.springbootmasterslaveexample.repository.readonly.UserReadOnlyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Ragil Gilang Maulana
 * @Date : 11/07/22
 **/

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserReadOnlyRepository userReadOnlyRepository;


    public User createUser(User user){
        return userRepository.save(user);
    }


    public List<User> getAllUsers(){
        return userReadOnlyRepository.findAll();
    }
}

package com.enterprise.service;

import com.enterprise.model.Users;
import com.enterprise.repositoty.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users save(Users users) {
        return userRepository.save(users);
    }

    public List<Users> saveAll(List<Users> users) {
        return userRepository.saveAll(users);
    }

    public List<Users> findAll() {
        return userRepository.findAll();
    }
    public Users getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public Users updateUsers(Users users) {
        users.setUserId(users.getUserId());
        Users existingUser=userRepository.findById(users.getUserId()).get();
        users.setUserId(users.getUserId());
        existingUser.setFirstName(users.getFirstName());
        existingUser.setLastName(users.getLastName());
        existingUser.setMobileNumber(users.getMobileNumber());
        return userRepository.save(existingUser);
    }

    public String deleteUserById(Long userId) {
       userRepository.deleteById(userId);
       return "userRemoved" + userId;
    }
}

package com.example.demo.services;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ArrayList<UserModel> searchAll(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel save(UserModel user){
        return userRepository.save(user);
    }

    public Optional<UserModel> findById(Long id){
        return userRepository.findById(id);
    }

    public ArrayList<UserModel> findByPriority(Integer priority){
        return userRepository.findByPriority(priority);
    }

    public Boolean deleteUser(Long id){
        try{
            userRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}

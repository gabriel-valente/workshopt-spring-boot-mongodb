package com.muhdo.workshopmongo.services;

import com.muhdo.workshopmongo.domain.User;
import com.muhdo.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}

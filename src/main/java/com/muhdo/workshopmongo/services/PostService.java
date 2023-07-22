package com.muhdo.workshopmongo.services;

import com.muhdo.workshopmongo.domain.Post;
import com.muhdo.workshopmongo.domain.User;
import com.muhdo.workshopmongo.repositories.PostRepository;
import com.muhdo.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
    }
}

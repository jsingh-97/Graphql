package com.example.graphqlserver.Service;

import com.example.graphqlserver.Model.Author;
import com.example.graphqlserver.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public Author getAuthorById(int id){
        return authorRepository.findById(id).get();
    }
}

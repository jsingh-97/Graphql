package com.example.graphqlserver.Service;

import com.example.graphqlserver.Model.Author;
import com.example.graphqlserver.Model.Book;
import com.example.graphqlserver.Repository.AuthorRepository;
import com.example.graphqlserver.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;

    public Book getBookById(int id){
        return booksRepository.findById(id).get();
    }

}

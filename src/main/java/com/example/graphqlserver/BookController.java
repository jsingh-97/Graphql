package com.example.graphqlserver;

import com.example.graphqlserver.Model.Author;
import com.example.graphqlserver.Model.Book;
import com.example.graphqlserver.Service.AuthorService;
import com.example.graphqlserver.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    BooksService booksService;
    @Autowired
    AuthorService authorService;

    @QueryMapping
    public Book bookById(@Argument int id){
        return booksService.getBookById(id);
    }
    @SchemaMapping
    public Author author(Book book){
        return authorService.getAuthorById(book.authorId);
    }
}

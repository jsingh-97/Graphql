package com.example.graphqlserver.Model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Entity(name = "books")
@Getter
public class Book  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "pagecount")
    private int pageCount;
    @Column(name = "author_id")
    public int authorId;

}

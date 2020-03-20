package com.tothenew.JPA_Assignment_3.Entities;

import javax.persistence.*;
import java.util.List;

//Create an Entity book with an instance variable bookName.
@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//Question 5. Create an Entity book with an instance variable bookName
    private String bookname;

//Question 6. Implement One to One mapping between Author and Book.
//    @OneToOne

//  Unidirectional many to one without using mapped by
//    @ManyToOne
//    @JoinColumn(name = "author_id")

    @ManyToMany(mappedBy = "book")
    private List<Author> author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public String getBookname() {
        return bookname;
    }

    public void setName(String bookname) {
        this.bookname = bookname;
    }
}


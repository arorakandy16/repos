package com.tothenew.JPA_Assignment_3.Entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //Question 2. Create instance variable of Address class inside Author class and save it as embedded object.
    private String name;
    @Embedded
    private Address address;

//Question 3. Introduce a List of subjects for author.
    @ElementCollection
    private List<String> subjects;

//Question 6. Implement One to One mapping between Author and Book.
//    @OneToOne(cascade = CascadeType.ALL)

//Question 7. Implement One to Many Mapping between Author and
//    Book(Unidirectional, BiDirectional and without additional table ) and implement cascade save.

//    Birectional
//    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)


//Question 8. Implement Many to Many Mapping between Author and Book.

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)

    @JoinTable(name="author_book",joinColumns = @JoinColumn(name = "author_id",
            referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "book_id",
            referencedColumnName = "id"))

    private List<Book> book;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects=subjects;
    }
}

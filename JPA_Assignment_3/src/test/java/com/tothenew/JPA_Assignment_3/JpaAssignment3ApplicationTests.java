package com.tothenew.JPA_Assignment_3;

import com.tothenew.JPA_Assignment_3.Entities.Address;
import com.tothenew.JPA_Assignment_3.Entities.Author;
import com.tothenew.JPA_Assignment_3.Entities.Book;
import com.tothenew.JPA_Assignment_3.Repositories.Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JpaAssignment3ApplicationTests {
	@Autowired
	Repository repository;
	@Test
	void contextLoads() {
	}

	@Test
	public void addDetails()
	{
		List<Author> authors=new ArrayList<>();
		Author author1=new Author();
		List<Book> books=new ArrayList<>();

		Book book=new Book();

		book.setName("The Vampire Diaries");
		book.setAuthor(authors);

		Book book2=new Book();

		book2.setAuthor(authors);
		book2.setName("The Secret Circle");

		books.add(book);
		books.add(book2);

		Address address=new Address();

		address.setStreetNumber(1);
		address.setLocation("Logix Zest Society");
		address.setState("Noida");


		List<String> subjects=new ArrayList<>();

		//Question 4. Persist 3 subjects for each author.

		subjects.add("Maths");
		subjects.add("Physics");
		subjects.add("Chemistry");

		author1.setName("L.J.Smith");
		author1.setSubjects(subjects);
		author1.setAddress(address);
		author1.setBook(books);

		book.setAuthor(authors);

		repository.save(author1);
	}

}

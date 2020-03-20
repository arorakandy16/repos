package com.tothenew.JPA_Assignment_3.Repositories;

import com.tothenew.JPA_Assignment_3.Entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Author,Integer> {
}

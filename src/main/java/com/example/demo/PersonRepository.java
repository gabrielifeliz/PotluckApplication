package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    Iterable<Person> findAllByFoodContainingIgnoreCase(String search);
}
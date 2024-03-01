package com.example.d8pb1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.d8pb1.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Long> {
    
    @Query("select p from Person p where p.name like ?1%")
    List<Person> findByNameStartsWith(String value);

    @Query("select p from Person p where p.name like %?1")
    List<Person> findByNameEndsWith(String value);

}

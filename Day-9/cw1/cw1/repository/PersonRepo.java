package com.example.cw1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.cw1.model.Person;


@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>
{
    @Modifying
    @Query(value="insert into person (first_name,last_name,age,gender,email) values (?1,?2,?3,?4,?5)",nativeQuery = true)
    void postPerson(String firstName,String lastName,int age,String gender,String email);

    

    @Query("select u from Person u where u.age=?1")
    List<Person> findByAge(int age);
}
package com.microcare.microservice.microcare_microservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microcare.microservice.microcare_microservice.entity.Book;
public interface BookRepo extends JpaRepository<Book,Integer>{

}

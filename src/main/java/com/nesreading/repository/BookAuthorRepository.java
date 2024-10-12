package com.nesreading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nesreading.domain.BookAuthor;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long> {

}

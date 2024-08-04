package com.example.memorydb.book.db.repository;

import com.example.memorydb.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<UserEntity, Long> {
}

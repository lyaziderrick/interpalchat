package com.example.interpal.repository;

import com.example.interpal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("FROM user_all  WHERE password = ?password")
    List<User> findByNameEndsWith(String password);
}

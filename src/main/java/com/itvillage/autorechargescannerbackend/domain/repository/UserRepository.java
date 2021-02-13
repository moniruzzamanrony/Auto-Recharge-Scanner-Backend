package com.itvillage.autorechargescannerbackend.domain.repository;

import com.itvillage.autorechargescannerbackend.domain.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}

package com.cau1.repository;

import com.cau1.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}

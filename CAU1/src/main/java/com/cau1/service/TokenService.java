package com.cau1.service;


import com.cau1.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);

}

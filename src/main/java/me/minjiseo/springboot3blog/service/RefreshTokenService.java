package me.minjiseo.springboot3blog.service;

import lombok.RequiredArgsConstructor;
import me.minjiseo.springboot3blog.domain.RefreshToken;
import me.minjiseo.springboot3blog.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken){
        return refreshTokenRepository.findByRefreshToken(refreshToken)
        .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}

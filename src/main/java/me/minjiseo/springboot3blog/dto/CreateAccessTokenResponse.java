package me.minjiseo.springboot3blog.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAccessTokenResponse {
    private String accessToken;

    public CreateAccessTokenResponse(String accessToken) {
        this.accessToken = accessToken;
    }

}

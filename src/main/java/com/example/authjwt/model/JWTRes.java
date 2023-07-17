package com.example.authjwt.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JWTRes {

    private String jwtToken;
    private String username;
}

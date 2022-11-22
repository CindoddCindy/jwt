package com.jwtjava.jwtuser.payload.response;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private Long id;
  private String username;
  private String phone;
  private String email;
  private List<String> roles;

  public JwtResponse(String accessToken, Long id, String username, String phone, String email, List<String> roles) {
    this.token = accessToken;
    this.id = id;
    this.username = username;
    this.phone=phone;
    this.email = email;
    this.roles = roles;
  }
  public JwtResponse(String token, String type, Long id, String username, String phone, String email,
      List<String> roles) {
    this.token = token;
    this.type = type;
    this.id = id;
    this.username = username;
    this.phone = phone;
    this.email = email;
    this.roles = roles;
  }
}

package com.jwtjava.jwtuser.repository;

import com.jwtjava.jwtuser.model.ERole;
import com.jwtjava.jwtuser.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}

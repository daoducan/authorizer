package com.andd.micro.authorizer.repository;

import com.andd.micro.authorizer.model.ERole;
import com.andd.micro.authorizer.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

package com.peaksoft.springBootBootstrap.repository;

import com.peaksoft.springBootBootstrap.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByNameRole(String role);
}

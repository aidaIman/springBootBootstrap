package com.peaksoft.springBootBootstrap.service;

import com.peaksoft.springBootBootstrap.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    void add(Role role);

    void edit(Role role);

    Role getById(int id);

    Role getByName(String name);
}

package com.bookstore.services;

import com.bookstore.entity.Role;
import com.bookstore.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private IRoleRepository roleRepository;

    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    public Role findRoleByName(String roleName) {
        return roleRepository.findByName(roleName);
    }
}